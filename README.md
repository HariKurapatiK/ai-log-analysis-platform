
# Day 1 Project – Log Service (Spring Boot + MySQL)

Simple Spring Boot microservice that receives logs via REST API
and stores them in MySQL.

## Requirements
- Java 17+
- Maven
- MySQL (Workbench)

## Run

mvn spring-boot:run

Server starts on:

http://localhost:8080

## Test API

POST http://localhost:8080/logs

Body (raw text):

ERROR Payment service timeout
