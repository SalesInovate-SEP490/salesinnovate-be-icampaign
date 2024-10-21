FROM openjdk:17

ARG JAR_FILE=target/*.jar

ADD ${JAR_FILE} icampagin-service.jar

ENTRYPOINT ["java","-jar","icampagin-service.jar"]

EXPOSE 8089











