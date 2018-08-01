package com.zkq.publicpro.activity

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.TextView
import com.trello.rxlifecycle.components.support.RxAppCompatActivity
import com.zkq.publicpro.R
import org.jetbrains.anko.find

/**
 * 公共父类方法
 * Created by Administrator on 2018/7/26.
 */
abstract class BaseActivity(var layoutId: Int) : RxAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //设置布局
        setContentView(layoutId)
        initView()
    }

    /**
     * 初始化toolbar
     */
    open fun initToolbar(text: Int=R.string.no_title, isShowBackBar: Boolean = true) {
        val toolbar: Toolbar? = find(R.id.toolbar)
        val tvTitle: TextView? = find(R.id.tv_toolbar_title)

        toolbar?.let {
            setSupportActionBar(toolbar)
            val actionBar = supportActionBar
            actionBar?.let {
                actionBar.setDisplayHomeAsUpEnabled(isShowBackBar)
                actionBar.setDisplayShowTitleEnabled(false)
                toolbar.setNavigationOnClickListener() { onBackPressed() }
            }
            tvTitle?.text = getString(text)
        }
    }

    /**
     * 功能说明:初始化组件
     */
    abstract fun initView()

    /**
     * 功能说明:为各个组件设置数据
     */
    abstract fun setData()

    /**
     * 功能说明:请求网络数据
     */
    abstract fun requestData()

}