/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import LISA.Message.KeyPairValue;
import LISA.Message.LISAMessage;
import LISA.ServiceCore.LISAServiceCore;
import java.util.Date;
import java.util.LinkedList;
import javax.jms.Connection;
import javax.jms.Message;

/**
 *
 * @author Linus
 */
public class LISAService1 extends LISAServiceCore {

    public LISAService1(Connection connection, String topicStr) {
        super(connection, topicStr);

    }

    @Override
    public void onMessage(Message message) {

    }

    @Override
    public void onStart() {

    }

    @Override
    public boolean action() {

        LISAMessage msgToSend = new LISAMessage();

        LinkedList<KeyPairValue> dataList = new LinkedList<KeyPairValue>();

        dataList.add(new KeyPairValue("time", " " + (new Date()).getTime()));

        msgToSend.setMsgData(dataList);

        publisher.sendMsg(msgToSend);

        return false;
    }

    @Override
    public void end() {

    }

}
