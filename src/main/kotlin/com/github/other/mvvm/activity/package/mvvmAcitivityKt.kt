package com.github.other.mvvm.activity.`package`

fun mvvmAcitivityKt(
    applicationPackage: String?,
    activityClass: String,
    layoutName: String,
    packageName: String,
    providerName:String

) = """
package ${packageName}.ui
import android.os.Bundle
import ${providerName}.jetpackmvvm.baseUI.BaseVMActivity
import ${packageName}.model.${activityClass}ViewModel
import ${packageName}.R
import ${packageName}.BR;
import ${packageName}.databinding.Activity${activityClass.substring(0, 1)}${
    activityClass.substring(
        1
    ).toLowerCase()
}Binding
class ${activityClass}Activity : BaseVMActivity<${activityClass}ViewModel, Activity${
    activityClass.substring(
        0,
        1
    )
}${activityClass.substring(1).toLowerCase()}Binding>() {
    override fun layoutId(): Int {
        return R.layout.${layoutName}
    }

    
    override fun Activity${activityClass.substring(0, 1)}${
    activityClass.substring(1).toLowerCase()
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