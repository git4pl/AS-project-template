package other.mvvm.activity.src.app_package


fun mvvmRepository(
    packageName: String,
    activityClass: String
) = """
package $packageName

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope

class ${activityClass}Repository (
    viewModel: ViewModel,
    coroutineScope: CoroutineScope,
) {
    // TODO("to be implemented")
}
"""