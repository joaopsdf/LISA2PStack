/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISA;

import LISA.ServiceCore.LISASimpleService;
import javax.jms.Connection;
import javax.jms.Message;

/**
 *
 * @author jpdsf
 */
public class LISASimpleServiceTest extends LISASimpleService{

    public LISASimpleServiceTest(Connection connection, String topicIn) {
        super(connection, topicIn);
    }

    @Override
    public void onMessage(Message message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void sendM(){
        publisher.sendMsg(null);
    }
    
}
