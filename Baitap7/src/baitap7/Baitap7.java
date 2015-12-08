/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap7;

import java.util.Scanner;
import LtdTools.LtdTools;

/**
 *
 * @author Limited
 */
public class Baitap7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jin = new Scanner(System.in);
        LtdTools ltdtools = new LtdTools();   
        
        System.out.print("Nhập vào, n = "); int n = jin.nextInt();
        System.out.println("Số Fibonacci thứ " + n + ": " + ltdtools.Fibonacci(n)); 

    }
    
}
