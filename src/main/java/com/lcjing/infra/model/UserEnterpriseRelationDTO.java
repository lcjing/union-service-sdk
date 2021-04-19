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
 * UserEnterpriseRelationDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-19T14:41:51.471+08:00")
public class UserEnterpriseRelationDTO   {
  @SerializedName("userAccountId")
  private String userAccountId = null;

  @SerializedName("enterpriseCode")
  private String enterpriseCode = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("lastUpdatedBy")
  private String lastUpdatedBy = null;

  @SerializedName("createdStamp")
  private LocalDate createdStamp = null;

  @SerializedName("lastUpdatedStamp")
  private LocalDate lastUpdatedStamp = null;

  public UserEnterpriseRelationDTO userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

   /**
   * 账户Id
   * @return userAccountId
  **/
  @ApiModelProperty(example = "null", value = "账户Id")
  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  public UserEnterpriseRelationDTO enterpriseCode(String enterpriseCode) {
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

  public UserEnterpriseRelationDTO enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * 用户与企业关系是否可用(1可用,0不可用)
   * @return enabled
  **/
  @ApiModelProperty(example = "null", value = "用户与企业关系是否可用(1可用,0不可用)")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UserEnterpriseRelationDTO createdBy(String createdBy) {
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

  public UserEnterpriseRelationDTO lastUpdatedBy(String lastUpdatedBy) {
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

  public UserEnterpriseRelationDTO createdStamp(LocalDate createdStamp) {
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

  public UserEnterpriseRelationDTO lastUpdatedStamp(LocalDate lastUpdatedStamp) {
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
    UserEnterpriseRelationDTO userEnterpriseRelationDTO = (UserEnterpriseRelationDTO) o;
    return Objects.equals(this.userAccountId, userEnterpriseRelationDTO.userAccountId) &&
        Objects.equals(this.enterpriseCode, userEnterpriseRelationDTO.enterpriseCode) &&
        Objects.equals(this.enabled, userEnterpriseRelationDTO.enabled) &&
        Objects.equals(this.createdBy, userEnterpriseRelationDTO.createdBy) &&
        Objects.equals(this.lastUpdatedBy, userEnterpriseRelationDTO.lastUpdatedBy) &&
        Objects.equals(this.createdStamp, userEnterpriseRelationDTO.createdStamp) &&
        Objects.equals(this.lastUpdatedStamp, userEnterpriseRelationDTO.lastUpdatedStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAccountId, enterpriseCode, enabled, createdBy, lastUpdatedBy, createdStamp, lastUpdatedStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEnterpriseRelationDTO {\n");
    
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
