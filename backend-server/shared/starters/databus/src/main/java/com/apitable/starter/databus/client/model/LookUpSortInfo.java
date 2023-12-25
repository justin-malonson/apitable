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
import com.apitable.starter.databus.client.model.ISortedField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LookUpSortInfo
 */
@JsonPropertyOrder({
  LookUpSortInfo.JSON_PROPERTY_RULES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LookUpSortInfo {
  public static final String JSON_PROPERTY_RULES = "rules";
  private List<ISortedField> rules = new ArrayList<>();

  public LookUpSortInfo() {
  }

  public LookUpSortInfo rules(List<ISortedField> rules) {
    
    this.rules = rules;
    return this;
  }

  public LookUpSortInfo addRulesItem(ISortedField rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ISortedField> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRules(List<ISortedField> rules) {
    this.rules = rules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookUpSortInfo lookUpSortInfo = (LookUpSortInfo) o;
    return Objects.equals(this.rules, lookUpSortInfo.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookUpSortInfo {\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

