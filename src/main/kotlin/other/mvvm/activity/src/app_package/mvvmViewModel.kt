package other.mvvm.activity.src.app_package


fun mvvmViewModel(
    packageName: String,
    activityClass: String
) = """
package $packageName
import androidx.lifecycle.ViewModel

class ${activityClass}ViewModel : ViewModel() {
    // TODO("to be implemented")
}    
"""