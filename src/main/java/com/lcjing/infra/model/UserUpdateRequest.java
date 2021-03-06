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
import com.lcjing.infra.model.UserDTO;
import com.lcjing.infra.model.UserExtendDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * UserUpdateRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-19T14:41:51.471+08:00")
public class UserUpdateRequest   {
  @SerializedName("originalCellphone")
  private String originalCellphone = null;

  @SerializedName("userDTO")
  private UserDTO userDTO = null;

  @SerializedName("userExtendDTO")
  private UserExtendDTO userExtendDTO = null;

  public UserUpdateRequest originalCellphone(String originalCellphone) {
    this.originalCellphone = originalCellphone;
    return this;
  }

   /**
   * 原手机号
   * @return originalCellphone
  **/
  @ApiModelProperty(example = "null", value = "原手机号")
  public String getOriginalCellphone() {
    return originalCellphone;
  }

  public void setOriginalCellphone(String originalCellphone) {
    this.originalCellphone = originalCellphone;
  }

  public UserUpdateRequest userDTO(UserDTO userDTO) {
    this.userDTO = userDTO;
    return this;
  }

   /**
   * Get userDTO
   * @return userDTO
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserDTO getUserDTO() {
    return userDTO;
  }

  public void setUserDTO(UserDTO userDTO) {
    this.userDTO = userDTO;
  }

  public UserUpdateRequest userExtendDTO(UserExtendDTO userExtendDTO) {
    this.userExtendDTO = userExtendDTO;
    return this;
  }

   /**
   * Get userExtendDTO
   * @return userExtendDTO
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserExtendDTO getUserExtendDTO() {
    return userExtendDTO;
  }

  public void setUserExtendDTO(UserExtendDTO userExtendDTO) {
    this.userExtendDTO = userExtendDTO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateRequest userUpdateRequest = (UserUpdateRequest) o;
    return Objects.equals(this.originalCellphone, userUpdateRequest.originalCellphone) &&
        Objects.equals(this.userDTO, userUpdateRequest.userDTO) &&
        Objects.equals(this.userExtendDTO, userUpdateRequest.userExtendDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalCellphone, userDTO, userExtendDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateRequest {\n");
    
    sb.append("    originalCellphone: ").append(toIndentedString(originalCellphone)).append("\n");
    sb.append("    userDTO: ").append(toIndentedString(userDTO)).append("\n");
    sb.append("    userExtendDTO: ").append(toIndentedString(userExtendDTO)).append("\n");
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

