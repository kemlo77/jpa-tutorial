#!/bin/bash
sudo docker run \
-d \
--rm \
--name mysql-db \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=radium \
-e MYSQL_DATABASE=test \
-e MYSQL_USER=marie \
-e MYSQL_PASSWORD=curie \
mysql:8.0.22


## Read more at https://hub.docker.com/_/mysql/
# Persisting volume?
#
## Connecting to container
# sudo docker exec -it mysql-db bash
#
## Connecting to database
# mysql -u marie -p
# curie
# show databases;
