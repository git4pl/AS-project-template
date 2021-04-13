package com.github.git4pl.asprojecttemplate.services

import com.github.git4pl.asprojecttemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
