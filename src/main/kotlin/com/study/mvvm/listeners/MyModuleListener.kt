package com.study.mvvm.listeners

import com.intellij.openapi.module.Module
import com.intellij.openapi.project.ModuleListener
import com.intellij.openapi.project.Project
import com.intellij.util.Function

class MyModuleListener : ModuleListener {

    /**
     * 添加模块完成时被调用
     */
    override fun moduleAdded(project: Project, module: Module) {
        super.moduleAdded(project, module)
    }

    /**
     * 模块被移除之前被调用
     */
    override fun beforeModuleRemoved(project: Project, module: Module) {
        super.beforeModuleRemoved(project, module)
    }

    /**
     * 模块被移除时被调用
     */
    override fun moduleRemoved(project: Project, module: Module) {
        super.moduleRemoved(project, module)
    }

    /**
     * 模块修改名字时被调用
     */
    override fun modulesRenamed(project: Project, modules: MutableList<Module>, oldNameProvider: Function<Module, String>) {
        super.modulesRenamed(project, modules, oldNameProvider)
    }

}