#!/bin/sh
echo "********************************************************"
echo "Inicializando el Discovery API [$PROFILE] en el puerto $SERVER_PORT"
echo "********************************************************"
cd /usr/local/@project.artifactId@/
java -Djava.security.egd=file:/dev/./urandom -DPORT=$SERVER_PORT \
    -Dspring.profiles.active=$PROFILE \
    -jar @project.build.finalName@.jar
