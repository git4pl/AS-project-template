package com.study.mvvm.menu

import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.DefaultActionGroup
import com.intellij.openapi.components.ApplicationComponent;

/**
 * 设置添加menu
 */
class CustomizeMenu : ApplicationComponent{

    override fun getComponentName(): String {
        return "CustomizeMenuPlugin"
    }

    override fun initComponent() {

        var am = ActionManager.getInstance()
        //添加action

        var mvvmAction = MVVMHelpAction()
        am.registerAction("mvvmHelpAction", mvvmAction)

        var sdkAction = SDKHelpAction()
        am.registerAction("sdkHelpAction", sdkAction)


        var windowsM = am.getAction("WindowMenu") as DefaultActionGroup
        windowsM.addSeparator()
        windowsM.add(mvvmAction)
        windowsM.add(sdkAction)
    }

}