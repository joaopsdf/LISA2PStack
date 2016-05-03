/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISA;

import LISA.ServiceCore.LISAServiceCore;
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
public class LISAService extends LISAServiceCore {

    private int n = 0;

    public LISAService(Connection connection, String topicStr) {
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
            Logger.getLogger(LISAService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void init() {
        System.out.println("init of " + this);
    }

    @Override
    public boolean action() {

        System.out.println("action for " + this);

        return false;
    }

    @Override
    public void end() {
        System.out.println("End of " + this.getClass());
    }

}
