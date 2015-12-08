/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap5n6;

import LtdTools.LtdTools;
import java.util.Scanner;
/**
 *
 * @author Limited
 */
public class Baitap5n6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jin = new Scanner(System.in);
        LtdTools ltdtools = new LtdTools();
        
        System.out.print("Nhập vào, n = "); int n = jin.nextInt();
        System.out.println("");
        
        System.out.print("Các số nguyên tố nhỏ hơn " + n + ": ");
        for (int i = 1; i < n; i++) {
            if (ltdtools.PrimeNumber(i))
                System.out.print(i + " ");
            
        }
        System.out.println("");
        
        System.out.print(n + " số nguyên tố đầu tiên: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(ltdtools.PrimeNumberN(i) + " ");            
        }
        System.out.println("");
        
    }
    
}
