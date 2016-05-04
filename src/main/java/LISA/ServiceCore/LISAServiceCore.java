/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISA.ServiceCore;

import LISA.ServiceCore.Publisher.Publisher;
import LISA.ServiceCore.Subscriber.Subscriber;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;

/**
 *
 * @author Linus
 */
public abstract class LISAServiceCore extends Subscriber implements LISAServiceLlifeCycle {

    public enum ServiceState {
        INIT, ACTION, END, WAITING
    }

    protected Publisher publisher = null;
    protected Connection connection = null;
    protected String topicStr;
    protected ServiceState state;

    public LISAServiceCore(Connection connection, String topicIn) {
        this.connection = connection;
        this.topicStr = topicIn;
        this.state = ServiceState.INIT;
        createSession();
        createPublisher();
        createSubscriber(topicStr);
    }

    private void createSession() {
        try {
            if (connection != null) {
                Session sessionNew = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
                setSession(sessionNew);
            }
        } catch (JMSException ex) {
            Logger.getLogger(LISAServiceCore.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void createPublisher() {
        publisher = new Publisher(session, topicStr);
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    private void setSession(Session session) {
        this.session = session;
    }

    public ServiceState getState() {
        return state;
    }

    public void setState(ServiceState state) {
        this.state = state;
    }
    //</editor-fold>
}
