# RelationApi

All URIs are relative to *http://localhost:8838/union-service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](RelationApi.md#create) | **POST** /relation | 创建用户与企业关系
[**getByAccountId**](RelationApi.md#getByAccountId) | **GET** /relation/enabled | 查询用户有效的企业关系
[**quit**](RelationApi.md#quit) | **PUT** /relation/quit | 解绑用户与企业关系
[**quits**](RelationApi.md#quits) | **POST** /relations/quit | 批量解绑用户与企业关系


<a name="create"></a>
# **create**
> BaseResult create(userAccountId, enterpriseCode)

创建用户与企业关系

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.RelationApi;


RelationApi apiInstance = new RelationApi();
String userAccountId = "userAccountId_example"; // String | 账户Id
String enterpriseCode = "enterpriseCode_example"; // String | 企业代码
try {
    BaseResult result = apiInstance.create(userAccountId, enterpriseCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**| 账户Id | [optional]
 **enterpriseCode** | **String**| 企业代码 | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getByAccountId"></a>
# **getByAccountId**
> BaseResult getByAccountId(userAccountId)

查询用户有效的企业关系

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.RelationApi;


RelationApi apiInstance = new RelationApi();
String userAccountId = "userAccountId_example"; // String | 账户Id
try {
    BaseResult result = apiInstance.getByAccountId(userAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationApi#getByAccountId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**| 账户Id | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="quit"></a>
# **quit**
> BaseResult quit(userAccountId, enterpriseCode)

解绑用户与企业关系

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.RelationApi;


RelationApi apiInstance = new RelationApi();
String userAccountId = "userAccountId_example"; // String | 账户Id
String enterpriseCode = "enterpriseCode_example"; // String | 企业代码
try {
    BaseResult result = apiInstance.quit(userAccountId, enterpriseCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationApi#quit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAccountId** | **String**| 账户Id | [optional]
 **enterpriseCode** | **String**| 企业代码 | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="quits"></a>
# **quits**
> BaseResult quits(request)

批量解绑用户与企业关系

### Example
```java
// Import classes:
//import com.lcjing.infra.ApiException;
//import com.lcjing.infra.api.RelationApi;


RelationApi apiInstance = new RelationApi();
UserEnterpriseRelationsRequest request = new UserEnterpriseRelationsRequest(); // UserEnterpriseRelationsRequest | 账户Id
try {
    BaseResult result = apiInstance.quits(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationApi#quits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UserEnterpriseRelationsRequest**](UserEnterpriseRelationsRequest.md)| 账户Id | [optional]

### Return type

[**BaseResult**](BaseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

