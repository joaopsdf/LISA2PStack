/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Endpoint_logeater;

import LISA.EndPointCore.LISAEndPointCore;
import javax.jms.Connection;

/**
 *
 * @author Linus
 */
public class EndPoint_logeater extends LISAEndPointCore {
    
    public static void main(String[] args) {
        
        Connection connection = createConnection();
        
        LogeaterService logeaterService = new LogeaterService(connection, "test.x", "test.x");
        
        services.put("logeater", logeaterService);
        
        endpointThread.start();
        
        
        
    }
    
}
