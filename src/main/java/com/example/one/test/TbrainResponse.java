package com.example.one.test;

import java.util.UUID;

/**
 * @author 崔耀中
 * @since 2020-08-27
 */
public class TbrainResponse {

    String id = "zjft_SortingLine_001";
    String msgType = "SortingLineToTbrainResponseMsg";
    Response response;

    class Response {
        Header header;
        Body body;

        class Header {
            String responseId = UUID.randomUUID().toString();
            String code = "00";
            String msg = "成功";

            public String getResponseId() {
                return responseId;
            }

            public void setResponseId(String responseId) {
                this.responseId = responseId;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getMsg() {
                return msg;
            }

            public void setMsg(String msg) {
                this.msg = msg;
            }
        }

        class Body {

        }

        public Header getHeader() {
            return header;
        }

        public void setHeader(Header header) {
            this.header = header;
        }

        public Body getBody() {
            return body;
        }

        public void setBody(Body body) {
            this.body = body;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }


}
