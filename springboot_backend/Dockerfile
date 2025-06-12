# Dockerfile
FROM eclipse-temurin:21-jdk-alpine
LABEL authors="ISAC"
# Set working directory
WORKDIR /app

COPY target/springboot_backend-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]