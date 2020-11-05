#!/bin/bash
sudo docker run \
-d \
--rm \
--name mySpringBoot \
--link mysql-db \
-p 8080:8080 \
-e spring_datasource_url="jdbc:mysql://mysql-db:3306/test" \
spring-boot-docker

#to build the image
# sudo ./gradlew bootBuildImage

# Connect at http://localhost:8080/
  
# Read about this at https://spring.io/guides/gs/spring-boot-docker/ 
