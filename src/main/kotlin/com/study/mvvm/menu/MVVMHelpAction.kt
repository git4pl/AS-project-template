package com.study.mvvm.menu

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

/**
 * MVVM使用详情
 */
class MVVMHelpAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {

        Messages.showInfoMessage("MVVM使用的步骤", "具体的使用步骤展示！")
    }
}