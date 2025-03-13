package com.github.other.mvvm.fragment.`package`

fun mvvmFragmentKt(
    applicationPackage: String?,
    activityClass: String,
    layoutName: String,
    packageName: String,
    providerName:String
) = """
package ${packageName}.ui.fragment
import ${packageName}.model.${activityClass}ViewModel
import android.os.Bundle
import ${providerName}.jetpackmvvm.baseUI.BaseVMFragment
import ${packageName}.R
import ${packageName}.BR;
import ${packageName}.databinding.Fragment${activityClass.substring(0, 1)}${
    activityClass.substring(
        1
    ).toLowerCase()
}Binding
class ${activityClass}Fragment : BaseVMFragment<${activityClass}ViewModel, Fragment${
    activityClass.substring(
        0,
        1
    )
}${
    activityClass.substring(
        1
    ).toLowerCase()
}Binding>(R.layout.${layoutName}) {

    
    override fun Fragment${
    activityClass.substring(
        0,
        1
    )
}${
    activityClass.substring(
        1
    ).toLowerCase()
}Binding.initView(savedInstanceState: Bundle?) {
    }
  
    /**
     *	监听数据的变化
     */
    override fun startObserve() {

    }
    
   

    override fun initData() {
       
    }
  
    }
    """