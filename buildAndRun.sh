#!/bin/sh
mvn clean package && docker build -t ca.baskwo/server .
docker rm -f server || true && docker run -d -p 9081:9080 -p 9444:9443 --name server ca.baskwo/server