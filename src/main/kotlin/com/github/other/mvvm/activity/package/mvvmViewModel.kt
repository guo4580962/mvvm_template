package com.github.other.mvvm.activity.`package`


fun mvvmViewModel(
    packageName:String,
    activityClass:String,
    providerName:String
)="""
package ${packageName}.model
import androidx.lifecycle.MutableLiveData
import ${providerName}.jetpackmvvm.ext.asyncIO
import ${providerName}.jetpackmvvm.ext.launchOnUI
import ${providerName}.jetpackmvvm.ext.logd
import ${providerName}.jetpackmvvm.net.MyFormBody
import ${providerName}.jetpackmvvm.model.BaseViewModel
import ${packageName}.repository.${activityClass}Repository
import kotlinx.coroutines.Job
class ${activityClass}ViewModel : BaseViewModel() {
    private val repo by lazy { ${activityClass}Repository() }
}    
"""