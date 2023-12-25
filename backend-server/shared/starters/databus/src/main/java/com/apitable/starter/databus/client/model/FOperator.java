/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.starter.databus.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets FOperator
 */
public enum FOperator {
  
  IS("is"),
  
  ISNOT("isNot"),
  
  CONTAINS("contains"),
  
  DOESNOTCONTAIN("doesNotContain"),
  
  ISEMPTY("isEmpty"),
  
  ISNOTEMPTY("isNotEmpty"),
  
  ISGREATER("isGreater"),
  
  ISGREATEREQUAL("isGreaterEqual"),
  
  ISLESS("isLess"),
  
  ISLESSEQUAL("isLessEqual"),
  
  ISREPEAT("isRepeat");

  private String value;

  FOperator(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FOperator fromValue(String value) {
    for (FOperator b : FOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

