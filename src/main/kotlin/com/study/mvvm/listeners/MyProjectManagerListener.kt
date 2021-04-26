package com.study.mvvm.listeners

import com.intellij.ProjectTopics
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.study.mvvm.services.MyProjectService
import freemarker.template.Configuration
import freemarker.template.Template
import freemarker.template.TemplateExceptionHandler
import org.gradle.internal.impldep.org.mozilla.javascript.Token.RETHROW
import org.mozilla.javascript.Token.RETHROW
import java.io.File
import java.io.OutputStreamWriter
import java.io.Writer


/**
 * 项目级别的事件监听
 */
internal class MyProjectManagerListener : ProjectManagerListener {
    companion object {
        var projectInstance: Project? = null
    }

    /**
     * 该方法在项目打开时被回调
     */
    override fun projectOpened(project: Project) {
        projectInstance = project


        val cfg = Configuration()
        //注册其他监听器
        project.messageBus.connect().subscribe(ProjectTopics.MODULES , MyModuleListener())
        project.getService(MyProjectService::class.java)
    }


    /**
     * 在关闭项目时，开始保存项目之前被回调，
     * 或者说是在调用FileDocumentManager#saveAllDocuments方法保存所有文件之前被调用
     */
    override fun projectClosingBeforeSave(project: Project) {
        super.projectClosingBeforeSave(project)

    }

    /**
     * 在projectClosingBeforeSave方法之后被回调
     */
    override fun projectClosing(project: Project) {
        projectInstance = null
        super.projectClosing(project)
    }


    /**
     * 与projectClosing的区别在于，projectClosed在项目已经关闭时被回调，
     * 在ProjectManagerImpl#closeProject方法执行到最后一行代码时被调用
     */
    override fun projectClosed(project: Project) {
        super.projectClosed(project)
    }


}
