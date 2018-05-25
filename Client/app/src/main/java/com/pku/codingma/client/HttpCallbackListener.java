package com.pku.codingma.client;

/**
 * Created by ma on 2016/4/19.
 */
//请求回调接口
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
