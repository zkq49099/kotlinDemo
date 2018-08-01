package com.zkq.publicpro.login.view

/**
 * Created by Administrator on 2018/7/31.
 */
interface LoginView {
    fun showProgress()
    fun hideProcess()
    fun setUsernameError()
    fun setPasswordError()
    fun navigateTohome()
}