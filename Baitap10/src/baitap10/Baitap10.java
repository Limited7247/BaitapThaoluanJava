/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap10;

import LtdTools.ArrayInteger;
import java.util.Scanner;

/**
 *
 * @author Limited
 */
public class Baitap10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayInteger array = new ArrayInteger();
        array.Read();
        array.Show();
        
        System.out.println("Phần tử lớn nhất: " + array.Max().Value + ", tại chỉ số: " + array.Max().index);
        System.out.println("Phần tử lớn thứ hai: " + array.SecondMax().Value + ", tại chỉ số: " + array.SecondMax().index);
        System.out.println("");
        
        array.SortDESC();
        array.Show();
        
        Scanner jin = new Scanner(System.in);
        System.out.print("Nhập số, x = "); int x = jin.nextInt();
        array.InsertDESC(x);
        array.Show();
    }
    
}
