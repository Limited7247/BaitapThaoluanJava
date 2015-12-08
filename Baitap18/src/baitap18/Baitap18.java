/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap18;

import javax.swing.JOptionPane;
import model.Officer;
import model.Producer;

/**
 *
 * @author Limited
 */
public class Baitap18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Officer officer = new Officer();
        Producer producer = new Producer();
        
        officer.ReadDialog();
        producer.ReadDialog();
        
        JOptionPane.showMessageDialog(null, "Tổng lương của hai nhân viên: " + String.format("%.2f", (float)(officer.Salary() + producer.Salary())), "Tổng lương nhân viên", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
