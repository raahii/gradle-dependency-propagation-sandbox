plugins {
    `project-report`
}

subprojects {
    apply(plugin = "project-report")

    tasks.withType<DependencyReportTask>().configureEach {
        projectReportDirectory = project.layout.projectDirectory
        configurations = setOf(
            project.configurations.getByName("compileClasspath"),
            project.configurations.getByName("testCompileClasspath"),
        )
    }
}
