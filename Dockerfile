FROM openjdk:17
LABEL maintainer="Tanuja"
ADD target/springboot-kafka-0.0.1-SNAPSHOT.jar kafka-docker.jar
ENTRYPOINT [ "java","-jar","kafka-docker.jar" ]