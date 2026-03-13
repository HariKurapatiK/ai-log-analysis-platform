package com.ai.logservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "log_record")
public class LogRecord {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String orderType;

 private String sourceSystem;

 private String backendSystem;

 private String userId;

 @Column(length = 1000)
 private String errorMessage;

 private String aiRootCause;

 private String aiSolution;

 // getters and setters

 public Long getId() {
  return id;
 }

 public String getOrderType() {
  return orderType;
 }

 public void setOrderType(String orderType) {
  this.orderType = orderType;
 }

 public String getSourceSystem() {
  return sourceSystem;
 }

 public void setSourceSystem(String sourceSystem) {
  this.sourceSystem = sourceSystem;
 }

 public String getBackendSystem() {
  return backendSystem;
 }

 public void setBackendSystem(String backendSystem) {
  this.backendSystem = backendSystem;
 }

 public String getUserId() {
  return userId;
 }

 public void setUserId(String userId) {
  this.userId = userId;
 }

 public String getErrorMessage() {
  return errorMessage;
 }

 public void setErrorMessage(String errorMessage) {
  this.errorMessage = errorMessage;
 }

 public String getAiRootCause() {
  return aiRootCause;
 }

 public void setAiRootCause(String aiRootCause) {
  this.aiRootCause = aiRootCause;
 }

 public String getAiSolution() {
  return aiSolution;
 }

 public void setAiSolution(String aiSolution) {
  this.aiSolution = aiSolution;
 }
}