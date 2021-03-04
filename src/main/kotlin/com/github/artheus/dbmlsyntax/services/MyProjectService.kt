package com.github.artheus.dbmlsyntax.services

import com.github.artheus.dbmlsyntax.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
