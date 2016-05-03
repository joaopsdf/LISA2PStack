/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISA.EndPointCore;

import LISA.LISAEndPoint;
import LISA.ServiceCore.LISAServiceCore;
import java.lang.reflect.Constructor;
import java.util.HashMap;


/**
 *
 * @author Linus
 */
public interface EndPointInterface {
    
    public static final Thread endpointThread = new Thread(new LISAEndPoint());
    
   
    public HashMap<String ,LISAServiceCore> services = new HashMap<String, LISAServiceCore>();

}
