/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISA;

//import LISA.EndPointCore.*;
import LISA.EndPointCore.LISAEndPointCore;
import javax.jms.Connection;

/**
 *
 * @author Linus
 */
public class LISAEndPoint extends LISAEndPointCore {

    public static void main(String[] args) {

        Connection connection = createConnection();

        LISAService s1 = new LISAService(connection, "test");
        LISAService s2 = new LISAService(connection, "test");

        services.put("s1", s1);
        services.put("s2", s2);

        endpointThread.start();

    }

}
