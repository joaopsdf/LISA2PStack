/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISA;

import LISA.ServiceCore.LISAServiceCore;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

/**
 *
 * @author Linus
 */
public class LISAService1 extends LISAServiceCore {

    private int n = 0;

    public LISAService1(Connection connection, String topicStr) {
        super(connection, topicStr);

    }

    @Override
    public void onMessage(Message message) {

        try {
            if (message instanceof TextMessage) {
                TextMessage textMessage = (TextMessage) message;
                String text = textMessage.getText();
                System.out.println(text);
                

            }
        } catch (JMSException ex) {
            Logger.getLogger(LISAService1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }



    @Override
    public boolean action() {
        
        List<String> values = dataMapping.get(serviceID);
        //System.out.println(serviceID);
        for (int i = 0; i < values.size(); i++) {
            System.out.println("Jag är s1, jag fick :" + values.remove(i));
        }
        
        

        return false;
    }

    @Override
    public void end() {
        System.out.println("End of " + this.getClass());
    }

}
