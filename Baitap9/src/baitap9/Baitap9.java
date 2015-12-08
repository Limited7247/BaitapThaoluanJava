/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap9;

import LtdTools.Matrix;

/**
 *
 * @author Limited
 */
public class Baitap9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matrix matrix = new Matrix();
        matrix.Read();
        matrix.Show();
        
        Matrix.Max max = matrix.new Max();
        max.Show();
        
        Matrix matrixPrime = new Matrix(matrix.MatrixofPrimeNumber());
        matrixPrime.Show();
        
        Matrix matrixOrderByColumns = new Matrix(matrix.MatrixOrderByColumns());
        matrixOrderByColumns.Show();
    }
    
}
