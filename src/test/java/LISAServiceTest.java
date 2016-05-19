/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import LISA.ServiceCore.LISAOneShotService;
import javax.jms.Connection;
import javax.jms.Message;

/**
 *
 * @author jpdsf
 */
public class LISAServiceTest extends LISAOneShotService {

    public LISAServiceTest(Connection connection, String topicIn) {
        super(connection, topicIn);
    }

    @Override
    public void onStart() {
        
    }

    @Override
    public void oneShotAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onMessage(Message message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
