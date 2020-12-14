FROM adoptopenjdk/openjdk11:latest

EXPOSE 8081

ADD target/test-web.jar test-web.jar

ENTRYPOINT ["java","-jar","test-web.jar"] 

