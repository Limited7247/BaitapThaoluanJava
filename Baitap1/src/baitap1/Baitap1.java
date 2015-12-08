/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;
import LtdTools.LtdTools;
import java.util.Scanner;

/**
 *
 * @author Limited
 */
public class Baitap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jin = new Scanner(System.in);
        LtdTools ltdtools = new LtdTools();
        
        System.out.print("Nhập vào, a = "); int a = jin.nextInt();
        System.out.print("          b = "); int b = jin.nextInt();
        System.out.println("");
        System.out.println("UCLN(" + a + ", " + b + ") = " + ltdtools.UCLN(a, b));
        System.out.println("BCNN(" + a + ", " + b + ") = " + ltdtools.BCNN(a, b));
        System.out.println("");
    }
    
}
