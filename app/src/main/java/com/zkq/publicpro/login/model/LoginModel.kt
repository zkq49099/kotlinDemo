package com.zkq.publicpro.login.model

/**
 * 登录处理方法接口
 * Created by Administrator on 2018/7/31.
 */
interface LoginModel {
    fun login(username: String, password: String, listener: OnLoginFinishListener)
}