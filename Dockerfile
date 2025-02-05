FROM openjdk:17
COPY ./target/*jar insureme.jar
ENTRYPOINT ["java","-jar","/insureme.jar"]
