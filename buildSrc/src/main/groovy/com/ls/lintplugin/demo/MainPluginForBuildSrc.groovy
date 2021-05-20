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



        /*
 * gradle task: 将git hooks 脚本复制到.git/hooks文件夹下
 * 根据不同的系统类型复制不同的git hooks脚本(现支持Windows、Linux两种)
 */
        project.task("testInstall").doLast {
            println(" testInstall task 开始执行 ---->")

//            println("OS Type:" + System.getProperty("os.name"))
//            File postCommit
//            String OSType = System.getProperty("os.name")
//            if (OSType.contains("Windows")) {
//                postCommit = new File(project.rootDir, "post-commit-windows")
//            } else {
//                println("============ mac 安装脚本  ===============")
//
//                postCommit = new File(project.rootDir, "post-commit")
//            }

//            project.copy {
//                from (postCommit) {
//                    rename {
//                        String filename ->
//                            "post-commit"
//                    }
//                }
//                into new File(project.rootDir, ".git/hooks/")
//            }
        }


    }
}
