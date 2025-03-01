plugins {
    `project-report`
    `java`
    `java-test-fixtures`
}

subprojects {
    apply(plugin = "project-report")
    apply(plugin = "java")
    apply(plugin = "java-test-fixtures")

    tasks.withType<DependencyReportTask>().configureEach {
        projectReportDirectory = project.layout.projectDirectory
        configurations = setOf(
            project.configurations.getByName("compileClasspath"),
            project.configurations.getByName("testCompileClasspath"),
            project.configurations.getByName("testFixturesCompileClasspath"),
        )
    }
}
