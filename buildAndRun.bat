@echo off
call mvn clean package
call docker build -t ca.baskwo/server .
call docker rm -f server
call docker run -d -p 9081:9080 -p 9444:9443 --name server ca.baskwo/server