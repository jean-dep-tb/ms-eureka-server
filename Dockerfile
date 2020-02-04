FROM openjdk:8
VOLUME /tmp
EXPOSE 8761
ADD ./target/spring.boot.webflux.ms.eureka-0.0.1-SNAPSHOT.jar ms.eureka.jar
ENTRYPOINT ["java","-jar","/ms.eureka.jar"]