package com.example.one;

import com.rfidread.Interface.IAsynchronousMessage;
import com.rfidread.RFIDReader;
import com.rfidread.SampleCode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 崔耀中
 * @since 2020-08-19
 */
@SpringBootTest
public class RfidReaderTest {

    /**
     * @Description 创建连接
     * @Param []
     */
    @Test
    public void RfidTest(){
        IAsynchronousMessage log = new SampleCode();
        if (RFIDReader.CreateTcpConn("10.2.72.189:9090",log)){
            System.out.println("创建连接成功！");
        }else {
            System.out.println("创建连接失败!");
        }
    }

    /**
     * @Description 回调获取标签信息
     * @Param
     */
//    public void OutPutTags(Tag_Model model) {
//        System.out.println("EPC：" + model._EPC + " TID：" + model._TID);
//    }

    /**
     * @Description 写入标签信息
     * @Param
     */
    public void RfidWrite() throws InterruptedException{
        String ConnID = "192.168.1.116:9090";
        IAsynchronousMessage log = new SampleCode();
        if(RFIDReader.CreateTcpConn(ConnID, log)) {
            RFIDReader._Config.Stop(ConnID);
            if(RFIDReader._Tag6C.WriteEPC_MatchTID(ConnID,1,"E002100SF001","E28011052000308565F90157",0,"00000001") != 0){
                System.out.println("写入EPC失败！");
            }else{
                System.out.println("写入EPC成功！");
            }
        }else{
            System.out.println("创建连接失败！");
        }

    }
}
