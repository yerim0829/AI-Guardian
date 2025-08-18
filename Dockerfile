# 1단계: 빌드 (Gradle/Maven 빌드 포함할 경우)
FROM gradle:7.6.4-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle clean build -x test

# 2단계: 런타임
FROM openjdk:17-jdk-slim
LABEL authors="kyuyoung"

WORKDIR /app

# 빌드 결과물 JAR 파일 복사 (Gradle 기준)
COPY --from=build /app/build/libs/*.jar app.jar

# 컨테이너 실행 시 스프링부트 앱 시작
ENTRYPOINT ["java", "-jar", "app.jar"]
