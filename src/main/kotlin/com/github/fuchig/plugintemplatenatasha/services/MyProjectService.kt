package com.github.fuchig.plugintemplatenatasha.services

import com.github.fuchig.plugintemplatenatasha.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
