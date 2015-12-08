/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import LtdTools.LtdTools;
import java.util.Scanner;
/**
 *
 * @author Limited
 */
public class Baitap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jin = new Scanner(System.in);
        LtdTools ltdtools = new LtdTools();
        
        System.out.print("Nhập vào, X = "); int X = jin.nextInt();
        System.out.println("Tổng các chữ số của số " + X + ", T = " + ltdtools.TongCacChuSo(X));
    }
    
}
