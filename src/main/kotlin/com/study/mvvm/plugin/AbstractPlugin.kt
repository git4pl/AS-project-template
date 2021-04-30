package com.study.mvvm.plugin

import java.util.*
import kotlin.collections.HashSet

/**
 * @Description
 * @Author shiq
 * @Date 2021/4/29 3:17 下午
 */
abstract class AbstractPlugin : Plugin {

    protected var pluginName :String ?= null

    protected var prefixName: HashSet<String>? = null

    override fun getName(): String? {
        return pluginName
    }

    override fun getPrefixName(): Set<String> {
        val names: MutableSet<String> = HashSet()
        if (prefixName != null && prefixName!!.size > 0) {
            names.addAll(prefixName!!)
        }
        return names
    }
}