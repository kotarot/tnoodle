plugins {
    `java-library`
}

description = "A Java scrambling suite. Java applications can use this project as a library. A perfect example of this is the webscrambles package."

repositories {
    mavenCentral()
}

dependencies {
    api(project(":svglite"))
    api(project(":min2phase"))
    
    implementation(project(":utils"))
    implementation(project(":threephase"))
    implementation(project(":sq12phase"))

    implementation("com.google.gwt:gwt-user:2.5.1")
    implementation("org.timepedia.exporter:gwtexporter:2.5.1")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
