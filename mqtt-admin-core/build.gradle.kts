dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.webjars:webjars-locator:0.52")
    implementation("org.webjars:bootstrap:5.3.3")
    implementation("mysql:mysql-connector-java:8.0.33")
    implementation("org.mybatis:mybatis:3.5.19")
    implementation("com.baomidou:mybatis-plus-spring-boot3-starter:3.5.10.1")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
