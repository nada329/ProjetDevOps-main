FROM openjdk:8-jre-alpine
ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \JAVA_OPTS=""
WORKDIR /app
ADD target/Timesheet-spring-boot-core-data-jpa-mvc-REST-1-1.5.jar Timesheet-spring-boot-core-data-jpa-mvc-REST-1-1.5.jar
EXPOSE 8082
CMD ["java", "-jar", "/Timesheet-spring-boot-core-data-jpa-mvc-REST-1-1.5.jar"]