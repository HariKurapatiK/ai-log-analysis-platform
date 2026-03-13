package com.ai.logservice.controller;

import com.ai.logservice.entity.LogRecord;
import com.ai.logservice.repository.LogRepository;
import com.ai.logservice.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logs")
public class LogController {

 private final LogRepository repository;
 private final KafkaProducerService kafkaProducer;

 public LogController(LogRepository repository, KafkaProducerService kafkaProducer) {
  this.repository = repository;
  this.kafkaProducer = kafkaProducer;
 }

 @PostMapping
 public LogRecord receiveLog(@RequestBody LogRecord log) {

  // Save log in database
  LogRecord savedLog = repository.save(log);

  // Send error message to Kafka
  kafkaProducer.sendLog(log.getErrorMessage());

  return savedLog;
 }
}