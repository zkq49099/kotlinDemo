package com.zkq.publicpro.login.model

import android.os.Handler
import android.text.TextUtils
import android.util.Log


/**
 * 实现登录处理方法
 * Created by Administrator on 2018/7/31.
 */
class LoginModelImp : LoginModel {
    /**
     * 登录处理逻辑
     */
    override fun login(username: String, password: String, listener: OnLoginFinishListener) {
        Handler().post(Runnable {
            if (TextUtils.isEmpty(username)) {
                listener.onUsernameError()
                Log.e("tag", username)
                return@Runnable
            }
            if (TextUtils.isEmpty(password)) {
                listener.onPasswordError()
                return@Runnable
            }
            listener.onSuccess()
        })


    }
}