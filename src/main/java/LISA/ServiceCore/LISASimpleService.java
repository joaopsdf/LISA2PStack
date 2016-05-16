/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISA.ServiceCore;

import javax.jms.Connection;

/**
 *
 * @author jpdsf
 */
public abstract class LISASimpleService extends LISAServiceCore{
    
    public LISASimpleService(Connection connection, String topicIn) {
        super(connection, topicIn);
    }
    
    @Override
    public boolean action() {
        return true;
    }

    @Override
    public void end() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }      
}
