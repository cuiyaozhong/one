package com.example.one;

import com.rfidread.Interface.IAsynchronousMessage;
import com.rfidread.Models.GPI_Model;
import com.rfidread.Models.Tag_Model;

/**
 * @author 崔耀中
 * @since 2020-08-20
 */
public class IAsynchronousMessageImpl implements IAsynchronousMessage {

    @Override
    public void WriteDebugMsg(String s) {

    }

    @Override
    public void WriteLog(String s) {

    }

    @Override
    public void PortConnecting(String s) {

    }

    @Override
    public void PortClosing(String s) {

    }

    @Override
    public void OutPutTags(Tag_Model model) {
        System.out.println("EPC：" + model._EPC + " TID：" + model._TID);
    }

    @Override
    public void OutPutTagsOver() {

    }

    @Override
    public void GPIControlMsg(GPI_Model gpi_model) {

    }
}
