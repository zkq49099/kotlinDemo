package com.zkq.publicpro.login.present

/**
 * Created by Administrator on 2018/7/31.
 */
interface LoginPresenter {
    fun validateCredentials(username: String, password: String)
    fun onDestoroy()
}