package other.mvvm.fragment.src.app_package

fun mvvmFragmentKt(
        applicationPackage: String?,
        fragmentClass: String,
        layoutName: String,
        packageName: String
) = """
package $packageName
import android.os.Bundle

class ${fragmentClass}Fragment : LazyVmFragment<${fragmentClass}ViewModel>() {

    override fun init(savedInstanceState: Bundle?) {
        TODO("to be implemented")
    }

    override fun lazyInit() {
        TODO("to be implemented")
    }

    override fun getLayoutId(): Int? {
        return R.layout.${layoutName}
    }

    override fun getDataBindingConfig(): DataBindingConfig? {
        return null
    }
    
    override fun initViewModel() {
        viewModel = getFragmentViewModel(${fragmentClass}ViewModel::class.java)
    }

}
"""