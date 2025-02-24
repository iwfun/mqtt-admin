import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
    java
    id("org.springframework.boot") version "3.4.3"
    id("io.spring.dependency-management") version "1.1.7"
}

tasks.findByName("bootJar")?.enabled = false;

allprojects {
    apply(plugin = "java")
    group = "com.iwfun"
    version = "0.0.1-SNAPSHOT"

    repositories {
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://maven.aliyun.com/repository/spring") }
        maven { url = uri("https://ci.pc.com.cn/nexus/content/repositories/public/") }
        mavenCentral()
    }

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(21)
        }
    }
    configurations {
        compileOnly {
            extendsFrom(configurations.annotationProcessor.get())
        }
    }
}

subprojects{
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    extensions.create("module", ModuleExtension::class, this)

    plugins.withType<SpringBootPlugin> {
        if (extensions.getByType<ModuleExtension>().isApiModule) {
            tasks.findByName("bootJar")?.enabled = false;
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

open class ModuleExtension(project: Project) {
    val isApiModule: Boolean = project.name.endsWith("-api")
}
