package com.zkq.publicpro.login.model

/**
 * Created by Administrator on 2018/7/31.
 */
interface OnLoginFinishListener {
    //用户名错误
    fun onUsernameError()
    //密码错误
    fun onPasswordError()
    //执行成功
    fun onSuccess()
}