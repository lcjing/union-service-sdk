# authc-union-service

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.lcjing.infra</groupId>
    <artifactId>authc-union-service</artifactId>
    <version>1.1.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.lcjing.infra:authc-union-service:1.1.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/authc-union-service-1.1.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.lcjing.infra.*;
import com.lcjing.infra.auth.*;
import com.lcjing.infra.model.*;
import com.lcjing.infra.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        
        AccountApi apiInstance = new AccountApi();
        String cellphone = "cellphone_example"; // String | 电话号码
        try {
            String result = apiInstance.disableAccount(cellphone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#disableAccount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8838/union-service*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**disableAccount**](docs/AccountApi.md#disableAccount) | **PUT** /account/disable/{cellphone} | 根据电话号码禁用用户
*AccountApi* | [**getAccount**](docs/AccountApi.md#getAccount) | **GET** /account/user/validate | 用户校验
*AccountApi* | [**getAccountByCassId**](docs/AccountApi.md#getAccountByCassId) | **GET** /account/accountid | 通过账户Id查询账户
*AccountApi* | [**getAccountByCellphone**](docs/AccountApi.md#getAccountByCellphone) | **GET** /account/user | 通过电话号码查询账户
*AccountApi* | [**obtainAccountId**](docs/AccountApi.md#obtainAccountId) | **POST** /account/id | 获取一账通accountId
*AccountApi* | [**obtainAccountIds**](docs/AccountApi.md#obtainAccountIds) | **POST** /account/ids | 批量获取一账通accountId
*EnterpriseApi* | [**modify**](docs/EnterpriseApi.md#modify) | **POST** /enterprise/modify/{code} | 修改企业信息
*EnterpriseApi* | [**registerEnterprise**](docs/EnterpriseApi.md#registerEnterprise) | **POST** /enterprise/register | 注册企业信息
*EnterpriseApi* | [**sync**](docs/EnterpriseApi.md#sync) | **POST** /enterprise/sync | 同步企业信息
*RelationApi* | [**create**](docs/RelationApi.md#create) | **POST** /relation | 创建用户与企业关系
*RelationApi* | [**getByAccountId**](docs/RelationApi.md#getByAccountId) | **GET** /relation/enabled | 查询用户有效的企业关系
*RelationApi* | [**quit**](docs/RelationApi.md#quit) | **PUT** /relation/quit | 解绑用户与企业关系
*RelationApi* | [**quits**](docs/RelationApi.md#quits) | **POST** /relations/quit | 批量解绑用户与企业关系
*UserApi* | [**deleteUserAccount**](docs/UserApi.md#deleteUserAccount) | **POST** /user/deleteUserAccount | 删除用户关系
*UserApi* | [**register**](docs/UserApi.md#register) | **POST** /user/register | 用户注册
*UserApi* | [**selectUser**](docs/UserApi.md#selectUser) | **GET** /user | 根据手机号和平台Id查询是否存在用户
*UserApi* | [**selectUserExtend**](docs/UserApi.md#selectUserExtend) | **GET** /userExtend | 查询用户扩展信息
*UserApi* | [**update**](docs/UserApi.md#update) | **POST** /user/update | 更新用户信息
*UserApi* | [**updateExtend**](docs/UserApi.md#updateExtend) | **POST** /userExtend/update | 更新用户扩展信息


## Documentation for Models

 - [Account](docs/Account.md)
 - [BaseResult](docs/BaseResult.md)
 - [EnterpriseDTO](docs/EnterpriseDTO.md)
 - [EnterpriseGeoDTO](docs/EnterpriseGeoDTO.md)
 - [ModifyEnterpriseRequest](docs/ModifyEnterpriseRequest.md)
 - [RegisterEnterpriseRequest](docs/RegisterEnterpriseRequest.md)
 - [RegisterEnterpriseResponse](docs/RegisterEnterpriseResponse.md)
 - [SyncEnterpriseRequest](docs/SyncEnterpriseRequest.md)
 - [UserDTO](docs/UserDTO.md)
 - [UserDeleteAccountRequest](docs/UserDeleteAccountRequest.md)
 - [UserEnterpriseRelationDTO](docs/UserEnterpriseRelationDTO.md)
 - [UserEnterpriseRelationsRequest](docs/UserEnterpriseRelationsRequest.md)
 - [UserExtendDTO](docs/UserExtendDTO.md)
 - [UserRegisterRequest](docs/UserRegisterRequest.md)
 - [UserUpdateRequest](docs/UserUpdateRequest.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



