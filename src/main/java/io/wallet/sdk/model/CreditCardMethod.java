/*
 * Wallet
 * User application
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.wallet.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * CreditCardMethod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-24T22:57:23.435-05:00")
public class CreditCardMethod implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("brand")
  private String brand = null;

  @SerializedName("cardOwnerName")
  private String cardOwnerName = null;

  @SerializedName("expirationMonth")
  private Integer expirationMonth = null;

  @SerializedName("expirationYear")
  private Integer expirationYear = null;

  @SerializedName("last4")
  private String last4 = null;

  @SerializedName("securityToken")
  private String securityToken = null;

  public CreditCardMethod brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(value = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public CreditCardMethod cardOwnerName(String cardOwnerName) {
    this.cardOwnerName = cardOwnerName;
    return this;
  }

   /**
   * Get cardOwnerName
   * @return cardOwnerName
  **/
  @ApiModelProperty(value = "")
  public String getCardOwnerName() {
    return cardOwnerName;
  }

  public void setCardOwnerName(String cardOwnerName) {
    this.cardOwnerName = cardOwnerName;
  }

  public CreditCardMethod expirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Get expirationMonth
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "")
  public Integer getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public CreditCardMethod expirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Get expirationYear
   * @return expirationYear
  **/
  @ApiModelProperty(value = "")
  public Integer getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
  }

  public CreditCardMethod last4(String last4) {
    this.last4 = last4;
    return this;
  }

   /**
   * Get last4
   * @return last4
  **/
  @ApiModelProperty(value = "")
  public String getLast4() {
    return last4;
  }

  public void setLast4(String last4) {
    this.last4 = last4;
  }

  public CreditCardMethod securityToken(String securityToken) {
    this.securityToken = securityToken;
    return this;
  }

   /**
   * Get securityToken
   * @return securityToken
  **/
  @ApiModelProperty(value = "")
  public String getSecurityToken() {
    return securityToken;
  }

  public void setSecurityToken(String securityToken) {
    this.securityToken = securityToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardMethod creditCardMethod = (CreditCardMethod) o;
    return Objects.equals(this.brand, creditCardMethod.brand) &&
        Objects.equals(this.cardOwnerName, creditCardMethod.cardOwnerName) &&
        Objects.equals(this.expirationMonth, creditCardMethod.expirationMonth) &&
        Objects.equals(this.expirationYear, creditCardMethod.expirationYear) &&
        Objects.equals(this.last4, creditCardMethod.last4) &&
        Objects.equals(this.securityToken, creditCardMethod.securityToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, cardOwnerName, expirationMonth, expirationYear, last4, securityToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardMethod {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    cardOwnerName: ").append(toIndentedString(cardOwnerName)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

