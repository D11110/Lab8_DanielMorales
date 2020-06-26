/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_danielmorales;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author danie
 */
public class Hilous extends Thread {

    private JProgressBar d;

    public Hilous() {
    }

    public Hilous(JProgressBar d) {
        this.d = d;
    }

    public void run() {
        for (int i = 1; i < 5; i++) {
            d.setValue(this.d.getValue()+1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilous.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        d.setValue(0);
    }

}
