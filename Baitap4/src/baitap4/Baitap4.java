/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import LtdTools.LtdTools;
import java.util.Scanner;

/**
 *
 * @author Limited
 */
public class Baitap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jin = new Scanner(System.in);
        System.out.print("Nhập vào, x = "); int x = jin.nextInt();
        
        LtdTools ltdtools = new LtdTools();
        System.out.println(x + " phân tích ra thừa số nguyên tố: " + ltdtools.Factorization(x));
    }
    
}
