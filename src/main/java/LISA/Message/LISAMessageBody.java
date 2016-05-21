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

    LinkedList<KeyPairValue> keyPairValues = new LinkedList<>();

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
//    public LinkedList<KeyPairValue> getKeyPairValues() {
//        return keyPairValues;
//    }
//
//    public Boolean setKeyPairValue(String data, String type) {
//        try {
//            keyPairValues.add(new KeyPairValue(type, data));
//            return true;
//        } catch (Exception e) {
//        }
//        return false;
//    }
    //</editor-fold>

    public LinkedList<KeyPairValue> getKeyPairValues() {
        return keyPairValues;
    }

    public void setKeyPairValues(LinkedList<KeyPairValue> keyPairValues) {
        this.keyPairValues = keyPairValues;
    }


    public void addKeyPairValues(LinkedList<KeyPairValue> keyPairValues) {
        this.keyPairValues.addAll(keyPairValues);
    }

}
