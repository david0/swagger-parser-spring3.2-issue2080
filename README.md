Minimal project to reproduce [Swagger Parser Issue #2080: Resolving relative refs broken with Spring Boot 3.2](https://github.com/swagger-api/swagger-parser/issues/2080)

Has to be run from jar to reproduce the problem:
```shell
./gradlew bootJar && java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
```