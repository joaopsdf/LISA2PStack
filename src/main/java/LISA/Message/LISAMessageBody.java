package LISA.Message;

import java.util.LinkedList;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Linus
 */
public class LISAMessageBody {

    private LinkedList<KeyPairValue> keyPairValues = new LinkedList<>();

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public LinkedList<KeyPairValue> getKeyPairValues() {
        return keyPairValues;
    }

    public Boolean addKeyPairValue(String data, String type) {
        try {
            keyPairValues.add(new KeyPairValue(type, data));
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    //</editor-fold>

    KeyPairValue kp = new KeyPairValue();

    public class KeyPairValue {

        private String type;
        private String data;

        public KeyPairValue() {
        }

        public KeyPairValue(String type, String data) {
            this.type = type;
            this.data = data;
        }

        //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
        //</editor-fold>        
    }

}
