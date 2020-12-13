package com.example.one.test;


import com.alibaba.fastjson.JSONObject;

/**
 * @author 崔耀中
 * @since 2020-08-27
 */
public class BuildResponse {


    public static String generate() {
        TbrainResponse tbrainResponse = new TbrainResponse();
        TbrainResponse.Response response = tbrainResponse.new Response();
        TbrainResponse.Response.Header header =response.new Header();
        response.setHeader(header);
        tbrainResponse.setResponse(response);
        String s = JSONObject.toJSONString(tbrainResponse);
        return s;
    }



}
