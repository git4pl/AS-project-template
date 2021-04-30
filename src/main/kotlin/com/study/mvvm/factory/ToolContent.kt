package com.study.mvvm.factory

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.ui.content.Content
import com.intellij.ui.content.ContentFactory
import com.study.mvvm.plugin.AboutUsPlugin
import com.study.mvvm.plugin.MVVMPlugin
import com.study.mvvm.plugin.SDKPlugin
import javax.swing.JComponent





/**
 * @Description
 * @Author shiq
 * @Date 2021/4/29 3:07 下午
 */
class ToolContent constructor(
        val project: Project,
        val toolWindow: ToolWindow,
        val contentFactory: ContentFactory) {

    public fun createJsonContent( name:String,  isLock:Boolean){
//        addContent(JsonForm(project, null).getContainer(), name, isLock)
    }


    fun createMVVMContent(name: String, isLock: Boolean) {
        addContent(MVVMPlugin.feedback(), name, isLock)
    }

    fun createSDKContent(name: String, isLock: Boolean) {
        addContent(SDKPlugin.feedback(), name, isLock)
    }

    fun createAboutUsContent(name: String, isLock: Boolean) {
        addContent(AboutUsPlugin.feedback(), name, isLock)
    }



    private fun addContent(container: JComponent, name: String, isLock: Boolean) {
        val content: Content = contentFactory.createContent(container, name, isLock)
        content.isCloseable = true
        toolWindow.contentManager.addContent(content)
    }

}