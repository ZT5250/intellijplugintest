package com.github.zt5250.intellijplugintest.services

import com.intellij.openapi.project.Project
import com.github.zt5250.intellijplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
