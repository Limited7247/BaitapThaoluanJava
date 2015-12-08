/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LtdTools;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Limited
 */
public class LtdString {
    public String string;

    public LtdString() {
        this.string = "";
    }
    
    public LtdString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
       
    public void ReadDialog()
    {
        this.string = JOptionPane.showInputDialog(null, "Nhập vào xâu ký tự", "Nhập xâu", JOptionPane.QUESTION_MESSAGE);
    }
    
    public void ShowDialog()
    {
        JOptionPane.showMessageDialog(null, "Xâu ký tự: \"" + this.string + "\"", "Hiển thị xâu ký tự", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void Standardize()
    {
        String strTemp = "";
        String strWorking = "";
        StringTokenizer tokensTemp = new StringTokenizer(this.string);
        
        while (tokensTemp.hasMoreTokens()) {
            strWorking = tokensTemp.nextToken();
            strWorking = strWorking.substring(0, 1).toUpperCase() + strWorking.substring(1, strWorking.length()).toLowerCase();
            strTemp += strWorking + " ";
        }
        
        this.string = strTemp.substring(0, strTemp.length()-1);
        
    }
    
    /**
     * <pre>Đảo ngược xâu.
     * 
     * Đảo ngược xâu ký tự ban đầu thành xâu mới. 
     * 
     * Ví dụ: 
     *  Xâu ban đầu: abcdef;
     *  Xâu mới:     fedcba; </pre>
     */
    public void Reverse()
    {
        StringBuffer temp = new StringBuffer(this.string);
        temp.reverse();
        
        this.string = temp.toString();
    }
}
