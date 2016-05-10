/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISA;

import LISA.Message.LISAMessage;
import LISA.Utils.*;

/**
 *
 * @author Linus
 */
public class testMarshall {
    public static void main(String[] args) {
        LISAMessage msg = new LISAMessage();
        msg.setMsgData("MSGdata", "data");
        //msg.getMessageHeader().setTimeStamp("2016-04-28 20:11:55");
        //msg.getMessageHeader().setHistory("history!!");
        //msg.getMessageHeader().setSenderID("tomten");
        
        String a = LISAMarshaller.marshallObj(msg);
        System.out.println(a);
        
        
        LISAMessage msg2 = (LISAMessage)LISAMarshaller.unMarshall(LISAMessage.class, a);
        
        System.out.println("\n" + msg2.getMsgData());
    }
}
