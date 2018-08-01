package com.zkq.publicpro.login.present

import com.zkq.publicpro.login.model.LoginModel
import com.zkq.publicpro.login.model.LoginModelImp
import com.zkq.publicpro.login.model.OnLoginFinishListener
import com.zkq.publicpro.login.view.LoginView

/**
 * Created by Administrator on 2018/7/31.
 */
class LoginPresentImp (loginView: LoginView) : LoginPresenter,OnLoginFinishListener{
    lateinit var loginV : LoginView
    lateinit var loginModel : LoginModel


    init {
        loginV = loginView
        loginModel = LoginModelImp()
    }


    //OnLoginFinishListener
    override fun onUsernameError() {
        if (loginV != null) {
            loginV.setUsernameError()
            loginV.hideProcess()
        }
    }
    //OnLoginFinishListener
    override fun onPasswordError() {
        if (loginV != null) {
            loginV.setPasswordError()
            loginV.hideProcess()
        }
    }
    //OnLoginFinishListener
    override fun onSuccess() {
        if (loginV != null) {
            loginV.navigateTohome()
            loginV.hideProcess()
        }
    }



    //LoginPresenter
    override fun validateCredentials(username: String, password: String) {
        if (loginV!=null){
            loginV.showProgress()
        }

        loginModel.login(username,password,this)
    }

    //LoginPresenter
    override fun onDestoroy() {
        loginV != null
    }
}