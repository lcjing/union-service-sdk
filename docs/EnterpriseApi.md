# EnterpriseApi

All URIs are relative to *http://localhost:8838/union-service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modify**](EnterpriseApi.md#modify) | **POST** /enterprise/modify/{code} | 修改企业信息
[**registerEnterprise**](EnterpriseApi.md#registerEnterprise) | **POST** /enterprise/register | 注册企业信息
[**sync**](EnterpriseApi.md#sync) | **POST** /enterprise/sync | 同步企业信息


<a name="modify"></a>
# **modify**
> BaseResult modify(code, request)

修改企业信息

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.EnterpriseApi;


EnterpriseApi apiInstance = new EnterpriseApi();
String code = "code_example"; // String | 企业代码
ModifyEnterpriseRequest request = new ModifyEnterpriseRequest(); // ModifyEnterpriseRequest | 企业注册请求
try {
    BaseResult result = apiInstance.modify(code, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseApi#modify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| 企业代码 |
 **request** | [**ModifyEnterpriseRequest**](ModifyEnterpriseRequest.md)| 企业注册请求 | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerEnterprise"></a>
# **registerEnterprise**
> BaseResult registerEnterprise(request)

注册企业信息

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.EnterpriseApi;


EnterpriseApi apiInstance = new EnterpriseApi();
RegisterEnterpriseRequest request = new RegisterEnterpriseRequest(); // RegisterEnterpriseRequest | 企业注册请求
try {
    BaseResult result = apiInstance.registerEnterprise(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseApi#registerEnterprise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RegisterEnterpriseRequest**](RegisterEnterpriseRequest.md)| 企业注册请求 | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sync"></a>
# **sync**
> BaseResult sync(request)

同步企业信息

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.EnterpriseApi;


EnterpriseApi apiInstance = new EnterpriseApi();
SyncEnterpriseRequest request = new SyncEnterpriseRequest(); // SyncEnterpriseRequest | 企业注册请求
try {
    BaseResult result = apiInstance.sync(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseApi#sync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SyncEnterpriseRequest**](SyncEnterpriseRequest.md)| 企业注册请求 | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

