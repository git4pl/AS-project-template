package other.mvvm.actions

import android.util.Log
import com.intellij.codeInsight.CodeInsightActionHandler
import com.intellij.codeInsight.generation.actions.BaseGenerateAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiFile

/**
 * Gson转换设置的Action
 */
class GsonFormatAction  : BaseGenerateAction{

    constructor():super(null)
    constructor(handler : CodeInsightActionHandler) : super(handler)

    override fun isValidForClass(targetClass: PsiClass?): Boolean {
        return super.isValidForClass(targetClass)
    }

    override fun isValidForFile(project: Project, editor: Editor, file: PsiFile): Boolean {
        return super.isValidForFile(project, editor, file)
    }

    override fun actionPerformed(e: AnActionEvent) {
        Log.e("shiq" , "我被点击了！")
        super.actionPerformed(e)
    }



}