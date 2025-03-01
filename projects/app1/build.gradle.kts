plugins {
  `java`
}

dependencies {
  implementation(projects.appBase)
  testImplementation(testFixtures(projects.appBase))
}
