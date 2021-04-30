package com.study.mvvm.plugin

import com.study.mvvm.bean.PluginResultBO
import org.json.JSONObject




/**
 * @Description
 * @Author shiq
 * @Date 2021/4/29 3:18 下午
 */
interface Plugin {
    fun getName(): String?

    fun getPrefixName(): Set<String>

    fun init(paramJSONObject: JSONObject)

    fun process(paramString1: String, paramBoolean: Boolean, paramString2: String): PluginResultBO

}