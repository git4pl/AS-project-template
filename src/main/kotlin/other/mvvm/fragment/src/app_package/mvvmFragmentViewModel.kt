package other.mvvm.fragment.src.app_package


fun mvvmFragmentViewModel(
    packageName: String,
    fragmentClass: String
) = """
package $packageName
import androidx.lifecycle.ViewModel

class ${fragmentClass}ViewModel : ViewModel() {
    TODO("to be implemented")
}    
"""