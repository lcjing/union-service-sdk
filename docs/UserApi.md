# UserApi

All URIs are relative to *http://localhost:8838/union-service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserAccount**](UserApi.md#deleteUserAccount) | **POST** /user/deleteUserAccount | 删除用户关系
[**register**](UserApi.md#register) | **POST** /user/register | 用户注册
[**selectUser**](UserApi.md#selectUser) | **GET** /user | 根据手机号和平台Id查询是否存在用户
[**selectUserExtend**](UserApi.md#selectUserExtend) | **GET** /userExtend | 查询用户扩展信息
[**update**](UserApi.md#update) | **POST** /user/update | 更新用户信息
[**updateExtend**](UserApi.md#updateExtend) | **POST** /userExtend/update | 更新用户扩展信息


<a name="deleteUserAccount"></a>
# **deleteUserAccount**
> BaseResult deleteUserAccount(request)

删除用户关系

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.UserApi;


UserApi apiInstance = new UserApi();
UserDeleteAccountRequest request = new UserDeleteAccountRequest(); // UserDeleteAccountRequest | 用户删除请求
try {
    BaseResult result = apiInstance.deleteUserAccount(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UserDeleteAccountRequest**](UserDeleteAccountRequest.md)| 用户删除请求 | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="register"></a>
# **register**
> BaseResult register(request)

用户注册

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.UserApi;


UserApi apiInstance = new UserApi();
UserRegisterRequest request = new UserRegisterRequest(); // UserRegisterRequest | 用户请求信息
try {
    BaseResult result = apiInstance.register(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#register");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UserRegisterRequest**](UserRegisterRequest.md)| 用户请求信息 | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="selectUser"></a>
# **selectUser**
> BaseResult selectUser(cellphone, platformId)

根据手机号和平台Id查询是否存在用户

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.UserApi;


UserApi apiInstance = new UserApi();
String cellphone = "cellphone_example"; // String | 电话号码
Integer platformId = 56; // Integer | 平台 id
try {
    BaseResult result = apiInstance.selectUser(cellphone, platformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#selectUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cellphone** | **String**| 电话号码 | [optional]
 **platformId** | **Integer**| 平台 id | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="selectUserExtend"></a>
# **selectUserExtend**
> BaseResult selectUserExtend(accountId, platformId)

查询用户扩展信息

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.UserApi;


UserApi apiInstance = new UserApi();
String accountId = "accountId_example"; // String | 账号 id
Integer platformId = 56; // Integer | 平台 id
try {
    BaseResult result = apiInstance.selectUserExtend(accountId, platformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#selectUserExtend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| 账号 id | [optional]
 **platformId** | **Integer**| 平台 id | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> BaseResult update(request)

更新用户信息

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.UserApi;


UserApi apiInstance = new UserApi();
UserUpdateRequest request = new UserUpdateRequest(); // UserUpdateRequest | 用户更新请求
try {
    BaseResult result = apiInstance.update(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UserUpdateRequest**](UserUpdateRequest.md)| 用户更新请求 | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateExtend"></a>
# **updateExtend**
> BaseResult updateExtend(userExtendDTO, platformId)

更新用户扩展信息

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.UserApi;


UserApi apiInstance = new UserApi();
UserExtendDTO userExtendDTO = new UserExtendDTO(); // UserExtendDTO | 用户更新请求
Integer platformId = 56; // Integer | 平台id
try {
    BaseResult result = apiInstance.updateExtend(userExtendDTO, platformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateExtend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userExtendDTO** | [**UserExtendDTO**](UserExtendDTO.md)| 用户更新请求 | [optional]
 **platformId** | **Integer**| 平台id | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

