/**
 * union-service
 * 一账通API接口
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.lcjing.infra.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;


/**
 * 企业信息
 */
@ApiModel(description = "企业信息")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-19T14:41:51.471+08:00")
public class EnterpriseDTO   {
  @SerializedName("enterpriseCode")
  private String enterpriseCode = null;

  @SerializedName("enterpriseName")
  private String enterpriseName = null;

  @SerializedName("unifiedSocialCreditCode")
  private String unifiedSocialCreditCode = null;

  @SerializedName("regCode")
  private String regCode = null;

  @SerializedName("taxCode")
  private String taxCode = null;

  @SerializedName("orgCode")
  private String orgCode = null;

  @SerializedName("isIntegration")
  private String isIntegration = null;

  @SerializedName("isEnabled")
  private Integer isEnabled = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("lastUpdatedBy")
  private String lastUpdatedBy = null;

  @SerializedName("createdStamp")
  private LocalDate createdStamp = null;

  @SerializedName("lastUpdatedStamp")
  private LocalDate lastUpdatedStamp = null;

  public EnterpriseDTO enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
    return this;
  }

   /**
   * 企业代码
   * @return enterpriseCode
  **/
  @ApiModelProperty(example = "null", value = "企业代码")
  public String getEnterpriseCode() {
    return enterpriseCode;
  }

  public void setEnterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
  }

  public EnterpriseDTO enterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
    return this;
  }

   /**
   * 企业名称
   * @return enterpriseName
  **/
  @ApiModelProperty(example = "null", value = "企业名称")
  public String getEnterpriseName() {
    return enterpriseName;
  }

  public void setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }

  public EnterpriseDTO unifiedSocialCreditCode(String unifiedSocialCreditCode) {
    this.unifiedSocialCreditCode = unifiedSocialCreditCode;
    return this;
  }

   /**
   * 统一社会信用代码
   * @return unifiedSocialCreditCode
  **/
  @ApiModelProperty(example = "null", value = "统一社会信用代码")
  public String getUnifiedSocialCreditCode() {
    return unifiedSocialCreditCode;
  }

  public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
    this.unifiedSocialCreditCode = unifiedSocialCreditCode;
  }

  public EnterpriseDTO regCode(String regCode) {
    this.regCode = regCode;
    return this;
  }

   /**
   * 营业执照号
   * @return regCode
  **/
  @ApiModelProperty(example = "null", value = "营业执照号")
  public String getRegCode() {
    return regCode;
  }

  public void setRegCode(String regCode) {
    this.regCode = regCode;
  }

  public EnterpriseDTO taxCode(String taxCode) {
    this.taxCode = taxCode;
    return this;
  }

   /**
   * 税务登记证号
   * @return taxCode
  **/
  @ApiModelProperty(example = "null", value = "税务登记证号")
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  public EnterpriseDTO orgCode(String orgCode) {
    this.orgCode = orgCode;
    return this;
  }

   /**
   * 组织机构代码
   * @return orgCode
  **/
  @ApiModelProperty(example = "null", value = "组织机构代码")
  public String getOrgCode() {
    return orgCode;
  }

  public void setOrgCode(String orgCode) {
    this.orgCode = orgCode;
  }

  public EnterpriseDTO isIntegration(String isIntegration) {
    this.isIntegration = isIntegration;
    return this;
  }

   /**
   * 是否三证合一
   * @return isIntegration
  **/
  @ApiModelProperty(example = "null", value = "是否三证合一")
  public String getIsIntegration() {
    return isIntegration;
  }

  public void setIsIntegration(String isIntegration) {
    this.isIntegration = isIntegration;
  }

  public EnterpriseDTO isEnabled(Integer isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * 是否启用
   * @return isEnabled
  **/
  @ApiModelProperty(example = "null", value = "是否启用")
  public Integer getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Integer isEnabled) {
    this.isEnabled = isEnabled;
  }

  public EnterpriseDTO createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * 创建人
   * @return createdBy
  **/
  @ApiModelProperty(example = "null", value = "创建人")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public EnterpriseDTO lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * 修改人
   * @return lastUpdatedBy
  **/
  @ApiModelProperty(example = "null", value = "修改人")
  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public EnterpriseDTO createdStamp(LocalDate createdStamp) {
    this.createdStamp = createdStamp;
    return this;
  }

   /**
   * 创建时间
   * @return createdStamp
  **/
  @ApiModelProperty(example = "null", value = "创建时间")
  public LocalDate getCreatedStamp() {
    return createdStamp;
  }

  public void setCreatedStamp(LocalDate createdStamp) {
    this.createdStamp = createdStamp;
  }

  public EnterpriseDTO lastUpdatedStamp(LocalDate lastUpdatedStamp) {
    this.lastUpdatedStamp = lastUpdatedStamp;
    return this;
  }

   /**
   * 修改时间
   * @return lastUpdatedStamp
  **/
  @ApiModelProperty(example = "null", value = "修改时间")
  public LocalDate getLastUpdatedStamp() {
    return lastUpdatedStamp;
  }

  public void setLastUpdatedStamp(LocalDate lastUpdatedStamp) {
    this.lastUpdatedStamp = lastUpdatedStamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseDTO enterpriseDTO = (EnterpriseDTO) o;
    return Objects.equals(this.enterpriseCode, enterpriseDTO.enterpriseCode) &&
        Objects.equals(this.enterpriseName, enterpriseDTO.enterpriseName) &&
        Objects.equals(this.unifiedSocialCreditCode, enterpriseDTO.unifiedSocialCreditCode) &&
        Objects.equals(this.regCode, enterpriseDTO.regCode) &&
        Objects.equals(this.taxCode, enterpriseDTO.taxCode) &&
        Objects.equals(this.orgCode, enterpriseDTO.orgCode) &&
        Objects.equals(this.isIntegration, enterpriseDTO.isIntegration) &&
        Objects.equals(this.isEnabled, enterpriseDTO.isEnabled) &&
        Objects.equals(this.createdBy, enterpriseDTO.createdBy) &&
        Objects.equals(this.lastUpdatedBy, enterpriseDTO.lastUpdatedBy) &&
        Objects.equals(this.createdStamp, enterpriseDTO.createdStamp) &&
        Objects.equals(this.lastUpdatedStamp, enterpriseDTO.lastUpdatedStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterpriseCode, enterpriseName, unifiedSocialCreditCode, regCode, taxCode, orgCode, isIntegration, isEnabled, createdBy, lastUpdatedBy, createdStamp, lastUpdatedStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseDTO {\n");
    
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
    sb.append("    unifiedSocialCreditCode: ").append(toIndentedString(unifiedSocialCreditCode)).append("\n");
    sb.append("    regCode: ").append(toIndentedString(regCode)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    orgCode: ").append(toIndentedString(orgCode)).append("\n");
    sb.append("    isIntegration: ").append(toIndentedString(isIntegration)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    createdStamp: ").append(toIndentedString(createdStamp)).append("\n");
    sb.append("    lastUpdatedStamp: ").append(toIndentedString(lastUpdatedStamp)).append("\n");
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

