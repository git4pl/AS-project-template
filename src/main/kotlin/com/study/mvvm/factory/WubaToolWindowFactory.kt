package com.study.mvvm.factory

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

/**
 * @Description 设置IDE界面布局右侧快捷键wuba开发助手
 * @Author shiq
 * @Date 2021/4/29 3:01 下午
 */
class WubaToolWindowFactory : ToolWindowFactory{

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {

        if (project == null || toolWindow == null)
            return

        var contentFactory = ContentFactory.SERVICE.getInstance();
        var toolContent = ToolContent(project, toolWindow, contentFactory)
        toolContent.createMVVMContent("MVVM使用", true)
        toolContent.createSDKContent("Api调用", true)
        toolContent.createAboutUsContent("联系我们", false)
    }

}