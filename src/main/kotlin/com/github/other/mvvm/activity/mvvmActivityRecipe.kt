package com.github.other.mvvm.activity

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.github.other.mvvm.activity.`package`.mvvmAcitivityKt
import com.github.other.mvvm.activity.`package`.mvvmRepository
import com.github.other.mvvm.activity.`package`.mvvmViewModel
import com.github.other.mvvm.activity.res.layout.mvvmActivityXml

fun RecipeExecutor.mvvmActivityRecipe(
    moduleData: ModuleTemplateData,
    activityClass: String,
    layoutName: String,
    packageName: String,
    providerName:String,

) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension
    projectData.applicationPackage
//    generateManifest(
//            moduleData = moduleData,
//            activityClass = "${activityClass}Activity",
//            activityTitle = activityClass,
//            packageName = packageName,
//            isLauncher = false,
//            hasNoActionBar = false,
//            generateActivityTitle = true,
//            requireTheme = false,
//            useMaterial2 = false
//    )

    val mvvmActivity = mvvmAcitivityKt(projectData.applicationPackage, activityClass, layoutName, packageName,providerName)
    // 保存Activity
    save(mvvmActivity, srcOut.resolve("ui/${activityClass}Activity.${ktOrJavaExt}"))
    // 保存xml
    save(mvvmActivityXml(packageName, activityClass), resOut.resolve("layout/${layoutName}.xml"))
    // 保存viewmodel
    save(mvvmViewModel(packageName, activityClass,providerName), srcOut.resolve("model/${activityClass}ViewModel.${ktOrJavaExt}"))
    // 保存repository
    save(mvvmRepository(packageName, activityClass,providerName), srcOut.resolve("repository/${activityClass}Repository.${ktOrJavaExt}"))
}