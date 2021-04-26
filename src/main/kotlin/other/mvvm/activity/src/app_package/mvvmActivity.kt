package other.mvvm.activity.src.app_package

/**
 * 创建Activity的模板代码实现
 */
fun mvvmActivityKt(
    applicationPackage: String?,
    activityClass: String,
    layoutName: String,
    packageName: String
) = """
package $packageName
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import ${packageName}.databinding.Activity${activityClass}Binding

class ${activityClass}Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ${activityClass}Binding = setContentView(this, R.layout.${layoutName}) as Activity${activityClass}Binding
        TODO("to be implemented")
    }
    
    /**
     *	监听数据的变化
     */
    fun observe() {
        TODO("to be implemented")
    }
    
    /**
     *  控件的点击事件
     */
    fun onClick() {
        TODO("to be implemented")
    }

} 
"""