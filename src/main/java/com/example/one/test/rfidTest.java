package com.example.one.test;

import com.rfidread.Enumeration.eReadType;
import com.rfidread.Interface.IAsynchronousMessage;
import com.rfidread.RFIDReader;
import com.rfidread.Tag6C;

/**
 * @author 崔耀中
 * @since 2020-08-21
 */
public class rfidTest {


    public static void RfidTest() throws InterruptedException {
        IAsynchronousMessage log = new IAsynchronousMessageImpl();
        String ConnID  = "10.2.72.189:9090";
        /**
         * @Description 创建连接
         * @Param []
         */
//        if (RFIDReader.CreateTcpConn("10.2.72.189:9090",log)) {
//            System.out.println("创建连接成功！");
//        }
//        else {
//            System.out.println("创建连接失败！");
//
//        }

        /**
         * @Description 修改读取方式（单次/循环）
         * @Param []
         */
        if (RFIDReader.CreateTcpConn("10.2.72.189:9090",log)){
            System.out.println("创建连接成功！");
            RFIDReader._Config.Stop(ConnID);
            int i= Tag6C.GetEPC_TID(ConnID,1, eReadType.Inventory);
            System.out.println(i);
        }else{
            System.out.println("创建连接失败！");
        }

        /**
         * @Description 匹配epc写入
         * @Param []
         */
//        if(RFIDReader.CreateTcpConn(ConnID, log)) {
//            int i = RFIDReader._Config.Stop(ConnID);
//            System.out.println(i);
//            if(Tag6C.WriteEPC_MatchEPC(ConnID,8,"E002100AA001","300833B2DDD9014000000000",0) != 0){
//                System.out.println("写入EPC失败！");
//            }else{
//                System.out.println("写入EPC成功！");
//            }
//        }else{
//            System.out.println("创建连接失败！");
//        }

        /**
         * @Description 匹配tid写入
         * @Param []
         */
//        if(RFIDReader.CreateTcpConn(ConnID, log)) {
//            int i=RFIDReader._Config.Stop(ConnID);
//            System.out.println(i);
//            if(Tag6C.WriteEPC_MatchTID(ConnID,1,"E002100F001","E280110C2000789EB4600990",0) != 0){
//                System.out.println("写入EPC失败！");
//            }else{
//                System.out.println("写入EPC成功！");
//            }
//        }else{
//            System.out.println("创建连接失败！");
//        }


    }


    public static void main(String[] args) throws InterruptedException{
        RfidTest();

    }





}
