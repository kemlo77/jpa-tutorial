#!/bin/bash
sudo docker run \
-d \
--rm \
--name phpMyAdmin \
--link mysql-db:db \
-p 8085:80 \
phpmyadmin/phpmyadmin 


# Connect at http://localhost:8085/
  
# Read about this at https://medium.com/coderscorner/connecting-to-mysql-through-docker-997aa2c090cc
