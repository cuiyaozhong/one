package com.example.one.test;

import com.alibaba.fastjson.JSONObject;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author 崔耀中
 * @since 2020-08-27
 */

public class RMSController {


    public static void main(String[] arg) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8895), 0);

        server.createContext("/", new TestHandler());
        server.start();
    }

    static  class TestHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            System.out.println("receive message from: "+ exchange.getRequestURI());
            Random random = new Random();
//            int i = random.nextInt(100);
            int i = 100;
            String s = "{\n" +
                    "    \"id\": \"geekCode_geekWarehouseCode_001\",\n" +
                    "    \"msgType\": \"RobotTaskResponseMsg\",\n" +
                    "    \"response\": {\n" +
                    "        \"header\": {\n" +
                    "            \"responseId\": \"a5a3eb48-1e10-4829-80cb-3b181d5339ad\",\n" +
                    "            \"code\": 0,\n" +
                    "            \"msg\": \"Success\"\n" +
                    "        },\n" +
                    "        \"body\": {\n" +
                    "            \"taskId\": "+i+"\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
            JSONObject jsonObject = JSONObject.parseObject(s);
            String response = JSONObject.toJSONString(jsonObject);
//            String requestBody = IOUtils.toString(exchange.getRequestBody(), Charset.defaultCharset());
            SimpleDateFormat sdf = new SimpleDateFormat();
            System.out.println(sdf.format(new Date()));
//            System.out.println("requestBody is: "+requestBody);
            System.out.println("responseBody is: "+response);
            exchange.sendResponseHeaders(200, 0);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

}
