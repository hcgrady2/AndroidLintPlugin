package com.ls.lintplugin.demo;


import org.gradle.api.Plugin
import org.gradle.api.Project

public class MainPluginForBuildSrc implements Plugin<Project> {

    @Override
    void apply(Project project) {

        println("测试 buildSrc plugin .......")
        project.extensions.create('pluginsrc', MyExtension)

        project.task('testPlugin')  {
            println("test plugin task 开始执行 ")

            println project.pluginsrc.message
        }

    }
}
