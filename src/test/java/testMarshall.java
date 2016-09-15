/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import LISA.Message.LISAMessage;
import LISA.Utils.*;
import java.util.LinkedList;
import LISA.Message.KeyPairValue;

/**
 *
 * @author Linus
 */
public class testMarshall {

    public static void main(String[] args) {
        LISAMessage msg = new LISAMessage();
        //msg.setMsgData("MSGdata", "data");
        
        LinkedList<KeyPairValue> list = new LinkedList<KeyPairValue>();
        
        list.add(new KeyPairValue("temperatur", "256.25"));
        list.add(new KeyPairValue("quantity", "36"));
        
        msg.getMessageBody().setKeyPairValues(list);
        msg.getMessageBody().setType("notify");

        //System.out.println(msg.getMsgData().getFirst().getData());
        String a = LISAMarshaller.marshallObj(msg);
        System.out.println(a);
        
        LISAMessage msg2 = (LISAMessage) LISAMarshaller.unMarshall(LISAMessage.class, a);
        
        System.out.println(LISAMarshaller.marshallObj(msg2));
        
        System.out.println("\n" + msg2);
    }
}
