FROM openjdk:8-jdk-alpine
COPY target/kalendarz-zagle-0.0.1-SNAPSHOT.jar ApiGatewayService.jar
EXPOSE 9000
ENTRYPOINT java -jar ApiGatewayService.jar api-gateway