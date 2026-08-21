# =========================
# Stage 1: Build
# =========================
FROM maven:3.9-eclipse-temurin-25 AS build

WORKDIR /app

# Copy Maven files first for better Docker layer caching
COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .

RUN chmod +x mvnw

# Download dependencies
RUN ./mvnw dependency:go-offline -DskipTests

# Copy source code
COPY src src

# Build Spring Boot application
RUN ./mvnw clean package -DskipTests


# =========================
# Stage 2: Run
# =========================
FROM eclipse-temurin:25-jre

WORKDIR /app

COPY --from=build /app/target/StaySavvy-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]