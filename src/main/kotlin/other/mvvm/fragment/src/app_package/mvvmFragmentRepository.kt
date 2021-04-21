package other.mvvm.fragment.src.app_package


fun mvvmFragmentRepository(
    packageName: String,
    fragmentClass: String
) = """
package $packageName

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope

class ${fragmentClass}Repository (
    viewModel: ViewModel,
    coroutineScope: CoroutineScope,
) {
    TODO("to be implemented")
}
"""