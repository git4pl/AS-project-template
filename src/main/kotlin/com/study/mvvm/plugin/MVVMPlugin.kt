package com.study.mvvm.plugin

import com.study.mvvm.bean.PluginResultBO
import org.json.JSONObject
import java.awt.BorderLayout
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel


/**
 * @Description MVVM用法展示
 * @Author shiq
 * @Date 2021/4/29 3:17 下午
 */
class MVVMPlugin : AbstractPlugin() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getPrefixName(): Set<String> {
        TODO()
    }

    override fun init(paramJSONObject: JSONObject) {
        pluginName = "mvvm"
        var set = HashSet<String>()
        set.add("mvvm")
        prefixName = set
    }

    override fun process(paramString1: String, paramBoolean: Boolean, paramString2: String): PluginResultBO {
        TODO("Not yet implemented")
    }


    companion object{

        fun feedback(): JComponent {
            val jLabel = JLabel("mvvm使用过程展示！请你按照此方式开始愉快的开发吧！", 0)
            val jPanel = JPanel()
            jPanel.layout = BorderLayout(10, 20)
            jPanel.add(jLabel, "Center")
            return jPanel
        }
    }

}