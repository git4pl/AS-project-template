package com.study.mvvm.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

/**
 * @Description 埋点数据调用
 * @Author shiq
 * @Date 2021/4/30 11:02 上午
 */
class ActionLogAction : AnAction(){
    override fun actionPerformed(e: AnActionEvent) {

        Messages.showInfoMessage("ActionLog使用", "ActionLog调用")
    }
}