/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EndPointElasticSearch;

import LISA.ServiceCore.LISAServiceCore;
import javax.jms.Connection;
import javax.jms.Message;
import org.elasticsearch.client.Client;

/**
 *
 * @author Linus
 */
public class ElasticSearchService extends LISAServiceCore{

    Client client;
    
    
    public ElasticSearchService(Connection connection, String topicIn) {
        super(connection, topicIn);
    }

    @Override
    public void onMessage(Message message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onStart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean action() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void end() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
