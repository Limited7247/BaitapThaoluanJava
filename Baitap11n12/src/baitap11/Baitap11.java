/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap11;

import LtdTools.ArrayInteger;
import java.util.Scanner;

/**
 *
 * @author Limited
 */
public class Baitap11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayInteger array = new ArrayInteger();
        array.Read();
        array.Show();
        
        array.ShortestDistance();
        
        System.out.println("Tổng số phần tử có giá trị là số chẵn: " + array.CountEvenNumber());
        System.out.println("");
        
        Scanner jin = new Scanner(System.in);
        System.out.print("Nhập vào, x = "); int x = jin.nextInt();
        System.out.print("Vị trí các phần tử có giá trị " + x + ": " + array.PositionX(x)); System.out.println("");
        
        System.out.println("Giá trị lớn nhất: " + array.Max().Value);
        System.out.println("Giá trị nhỏ nhất: " + array.Min().Value);
    }
    
}
