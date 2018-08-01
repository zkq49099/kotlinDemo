package com.zkq.publicpro.login

import android.support.design.widget.TextInputEditText
import android.support.v7.widget.AppCompatButton
import android.view.View
import com.zkq.publicpro.R
import com.zkq.publicpro.activity.BaseActivity
import com.zkq.publicpro.login.present.LoginPresentImp
import com.zkq.publicpro.login.present.LoginPresenter
import com.zkq.publicpro.login.view.LoginView
import org.jetbrains.anko.find
import org.jetbrains.anko.toast

/**
 * Created by Administrator on 2018/7/31.
 */
class LoginActivity : BaseActivity(R.layout.activity_login), LoginView {

    lateinit var present: LoginPresenter
    var name: String = ""
    var word: String = ""


    override fun showProgress() {
    }

    override fun hideProcess() {
    }

    override fun setUsernameError() {
        toast("请输入用户名")
    }

    override fun setPasswordError() {
        toast("请输入密码")
    }

    override fun navigateTohome() {
        toast("登录成功")
    }

    override fun initView() {
        val button = find<AppCompatButton>(R.id.btnServerLogin)
        val username = find<TextInputEditText>(R.id.et_email)
        val password = find<TextInputEditText>(R.id.et_password)

        present = LoginPresentImp(this)

        button.setOnClickListener { v: View? ->
            name =username.text.toString()
            word = password.text.toString()
            present.validateCredentials(name,word)
        }
    }

    override fun setData() {
    }

    override fun requestData() {
    }
}