package com.github.other.mvvm.activity.`package`

fun mvvmRepository(
    packageName:String,
    activityClass:String,
    providerName:String
)="""
package ${packageName}.repository


import ${providerName}.provider.repository.ProviderRepository
import com.google.gson.reflect.TypeToken
import ${providerName}.jetpackmvvm.bean.Result
import ${providerName}.provider.ext.convert2


class ${activityClass}Repository : ProviderRepository() {
    
   //   suspend fun a(map: Map<String, Any>): Result<String> {
      //  return apiService.a(map).convert(typeToken = object : TypeToken<String>() {})
  //  }

}
"""