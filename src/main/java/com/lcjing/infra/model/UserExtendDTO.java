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


/**
 * UserExtendDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-19T14:41:51.471+08:00")
public class UserExtendDTO   {
  @SerializedName("userAccountId")
  private String userAccountId = null;

  @SerializedName("userNickname")
  private String userNickname = null;

  @SerializedName("userGender")
  private String userGender = null;

  @SerializedName("headImgUrl")
  private String headImgUrl = null;

  @SerializedName("remark")
  private String remark = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createdStamp")
  private String createdStamp = null;

  @SerializedName("lastUpdatedBy")
  private String lastUpdatedBy = null;

  @SerializedName("lastUpdatedStamp")
  private String lastUpdatedStamp = null;

  public UserExtendDTO userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

   /**
   * 用户ID
   * @return userAccountId
  **/
  @ApiModelProperty(example = "null", value = "用户ID")
  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }

  public UserExtendDTO userNickname(String userNickname) {
    this.userNickname = userNickname;
    return this;
  }

   /**
   * 用户昵称
   * @return userNickname
  **/
  @ApiModelProperty(example = "null", value = "用户昵称")
  public String getUserNickname() {
    return userNickname;
  }

  public void setUserNickname(String userNickname) {
    this.userNickname = userNickname;
  }

  public UserExtendDTO userGender(String userGender) {
    this.userGender = userGender;
    return this;
  }

   /**
   * 用户性别
   * @return userGender
  **/
  @ApiModelProperty(example = "null", value = "用户性别")
  public String getUserGender() {
    return userGender;
  }

  public void setUserGender(String userGender) {
    this.userGender = userGender;
  }

  public UserExtendDTO headImgUrl(String headImgUrl) {
    this.headImgUrl = headImgUrl;
    return this;
  }

   /**
   * 用户头像
   * @return headImgUrl
  **/
  @ApiModelProperty(example = "null", value = "用户头像")
  public String getHeadImgUrl() {
    return headImgUrl;
  }

  public void setHeadImgUrl(String headImgUrl) {
    this.headImgUrl = headImgUrl;
  }

  public UserExtendDTO remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * 操作说明
   * @return remark
  **/
  @ApiModelProperty(example = "null", value = "操作说明")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public UserExtendDTO createdBy(String createdBy) {
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

  public UserExtendDTO createdStamp(String createdStamp) {
    this.createdStamp = createdStamp;
    return this;
  }

   /**
   * 创建时间
   * @return createdStamp
  **/
  @ApiModelProperty(example = "null", value = "创建时间")
  public String getCreatedStamp() {
    return createdStamp;
  }

  public void setCreatedStamp(String createdStamp) {
    this.createdStamp = createdStamp;
  }

  public UserExtendDTO lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * 更新人
   * @return lastUpdatedBy
  **/
  @ApiModelProperty(example = "null", value = "更新人")
  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public UserExtendDTO lastUpdatedStamp(String lastUpdatedStamp) {
    this.lastUpdatedStamp = lastUpdatedStamp;
    return this;
  }

   /**
   * 更新时间
   * @return lastUpdatedStamp
  **/
  @ApiModelProperty(example = "null", value = "更新时间")
  public String getLastUpdatedStamp() {
    return lastUpdatedStamp;
  }

  public void setLastUpdatedStamp(String lastUpdatedStamp) {
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
    UserExtendDTO userExtendDTO = (UserExtendDTO) o;
    return Objects.equals(this.userAccountId, userExtendDTO.userAccountId) &&
        Objects.equals(this.userNickname, userExtendDTO.userNickname) &&
        Objects.equals(this.userGender, userExtendDTO.userGender) &&
        Objects.equals(this.headImgUrl, userExtendDTO.headImgUrl) &&
        Objects.equals(this.remark, userExtendDTO.remark) &&
        Objects.equals(this.createdBy, userExtendDTO.createdBy) &&
        Objects.equals(this.createdStamp, userExtendDTO.createdStamp) &&
        Objects.equals(this.lastUpdatedBy, userExtendDTO.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedStamp, userExtendDTO.lastUpdatedStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAccountId, userNickname, userGender, headImgUrl, remark, createdBy, createdStamp, lastUpdatedBy, lastUpdatedStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserExtendDTO {\n");
    
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    userNickname: ").append(toIndentedString(userNickname)).append("\n");
    sb.append("    userGender: ").append(toIndentedString(userGender)).append("\n");
    sb.append("    headImgUrl: ").append(toIndentedString(headImgUrl)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdStamp: ").append(toIndentedString(createdStamp)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
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

