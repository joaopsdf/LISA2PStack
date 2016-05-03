/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISA.Message;

import javax.xml.bind.annotation.XmlRootElement;



/**
 *
 * @author Linus
 */
@XmlRootElement
public class LISAMessage {

    private LISAMessageHeader messageHeader;
    private LISAMessageBody messageBody;
    private String name;

    
    
    public LISAMessage() {
        this.messageHeader = new LISAMessageHeader();
        this.messageBody = new LISAMessageBody();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public LISAMessageHeader getMessageHeader() {
        return messageHeader;
    }

    public void setMessageHeader(LISAMessageHeader messageHeader) {
        this.messageHeader = messageHeader;
    }

    public LISAMessageBody getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(LISAMessageBody messageBody) {
        this.messageBody = messageBody;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //</editor-fold>
}
