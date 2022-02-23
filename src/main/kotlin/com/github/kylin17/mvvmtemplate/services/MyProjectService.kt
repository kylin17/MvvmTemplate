package com.github.kylin17.mvvmtemplate.services

import com.intellij.openapi.project.Project
import com.github.kylin17.mvvmtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
