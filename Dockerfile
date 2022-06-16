FROM openjdk:8u191-jre-alpine3.8
WORKDIR /usr/share/alpineDirectory

# for the delay while registration node
RUN apk add curl jq

# add needed .jars etc to workdir
ADD target/selenium-docker-tests.jar selenium-docker-tests.jar
ADD target/selenium-docker.jar selenium-docker.jar
ADD target/libs libs

#add suite files
ADD navigate.xml navigate.xml
ADD login.xml login.xml
ADD healthcheck.sh healthcheck.sh


ENTRYPOINT sh healthcheck.sh

