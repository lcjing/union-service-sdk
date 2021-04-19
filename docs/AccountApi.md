# AccountApi

All URIs are relative to *http://localhost:8838/union-service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableAccount**](AccountApi.md#disableAccount) | **PUT** /account/disable/{cellphone} | 根据电话号码禁用用户
[**getAccount**](AccountApi.md#getAccount) | **GET** /account/user/validate | 用户校验
[**getAccountByCassId**](AccountApi.md#getAccountByCassId) | **GET** /account/accountid | 通过账户Id查询账户
[**getAccountByCellphone**](AccountApi.md#getAccountByCellphone) | **GET** /account/user | 通过电话号码查询账户
[**obtainAccountId**](AccountApi.md#obtainAccountId) | **POST** /account/id | 获取一账通accountId
[**obtainAccountIds**](AccountApi.md#obtainAccountIds) | **POST** /account/ids | 批量获取一账通accountId


<a name="disableAccount"></a>
# **disableAccount**
> String disableAccount(cellphone)

根据电话号码禁用用户

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String cellphone = "cellphone_example"; // String | 电话号码
try {
    String result = apiInstance.disableAccount(cellphone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#disableAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cellphone** | **String**| 电话号码 |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccount"></a>
# **getAccount**
> Account getAccount(platformId, username, password)

用户校验

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String platformId = "platformId_example"; // String | 平台Id
String username = "username_example"; // String | 用户名
String password = "password_example"; // String | 密码
try {
    Account result = apiInstance.getAccount(platformId, username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platformId** | **String**| 平台Id | [optional]
 **username** | **String**| 用户名 | [optional]
 **password** | **String**| 密码 | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountByCassId"></a>
# **getAccountByCassId**
> Account getAccountByCassId(accountid)

通过账户Id查询账户

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String accountid = "accountid_example"; // String | 账户Id
try {
    Account result = apiInstance.getAccountByCassId(accountid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountByCassId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| 账户Id | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountByCellphone"></a>
# **getAccountByCellphone**
> Account getAccountByCellphone(cellphone)

通过电话号码查询账户

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String cellphone = "cellphone_example"; // String | 电话号码
try {
    Account result = apiInstance.getAccountByCellphone(cellphone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountByCellphone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cellphone** | **String**| 电话号码 | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="obtainAccountId"></a>
# **obtainAccountId**
> String obtainAccountId(cellphone)

获取一账通accountId

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String cellphone = "cellphone_example"; // String | 电话号码
try {
    String result = apiInstance.obtainAccountId(cellphone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#obtainAccountId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cellphone** | **String**| 电话号码 | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="obtainAccountIds"></a>
# **obtainAccountIds**
> obtainAccountIds(cellphones)

批量获取一账通accountId

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.AccountApi;


AccountApi apiInstance = new AccountApi();
List<String> cellphones = Arrays.asList("cellphones_example"); // List<String> | 电话号码集合
try {
    apiInstance.obtainAccountIds(cellphones);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#obtainAccountIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cellphones** | [**List&lt;String&gt;**](String.md)| 电话号码集合 | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

