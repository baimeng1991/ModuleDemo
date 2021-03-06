package com.sinieco.lib_volley.volley.inter;

import org.apache.http.HttpEntity;

import java.util.Map;

/**
 * Created by BaiMeng on 2017/11/3.
 * 联网的操作,成功后会放回HttpEntity
 */
public interface IHttpListener<M> {
    void onSuccess(HttpEntity entity);
    void onFail();
    void addHeader(Map<String,String> headerMap);
}
