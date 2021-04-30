package com.study.mvvm.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

/**
 * @Description : 用于调用Wuba网络调用
 * @Author shiq
 * @Date 2021/4/30 10:58 上午
 */
class WubaNetAction : AnAction(){

    override fun actionPerformed(e: AnActionEvent) {
        Messages.showInfoMessage("wubaNet使用", "wubaNet调用")
    }
}