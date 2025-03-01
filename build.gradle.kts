plugins {
    `project-report`
    `java`
}

subprojects {
    apply(plugin = "project-report")
    apply(plugin = "java")

    tasks.withType<DependencyReportTask>().configureEach {
        projectReportDirectory = project.layout.projectDirectory
        configurations = setOf(
            project.configurations.getByName("compileClasspath"),
            project.configurations.getByName("testCompileClasspath"),
        )
    }

    dependencies {
        testImplementation(project(":test-base"))
    }
}
