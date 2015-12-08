/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.Scanner;

/**
 *
 * @author Limited
 */
public class Baitap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jin = new Scanner(System.in);
        
        System.out.print("Nhập vào, x = "); int x = jin.nextInt();
        System.out.print("   Cơ số, b = "); int b = jin.nextInt();
        
        System.out.println(x + " ở cơ số " + b + ": " + Integer.toString(x, b));
    }
    
}
