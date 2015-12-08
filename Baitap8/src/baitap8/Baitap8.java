/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Limited
 */
public class Baitap8 {

    /**
     * @param sorted Mảng index dùng để sắp xếp
     * @return Trả về giá trị index đang chờ, đã sắp xếp xong, trả về -1
     */
    public static int WaitingIndex(int[] sorted)
    {
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] == -1) return i;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jin = new Scanner(System.in);
        System.out.print("Nhập vào, n = "); int n = jin.nextInt();
        float[] Array = new float[n];
        int[] Sorting = new int[n];
        int[] Sorted = new int[n];
        
        for (int i = 0; i < Array.length; i++) {
            Sorting[i] = i;
            Sorted[i]= -1;
            System.out.print("Nhập vào A[" + i + "] = "); Array[i] = jin.nextFloat();
        }
        System.out.println("");
        
        while (WaitingIndex(Sorted) != -1)
        {
            Sorted[WaitingIndex(Sorted)] = iMin(Array, Sorting);
            Sorting = Arrays.copyOf(arrrayRemoveAt(Sorting, indexSorting(Sorting, iMin(Array, Sorting))), Sorting.length-1);
        }
        
        System.out.print("Dãy số sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[Sorted[i]]+ " ");
        }
        System.out.println("");
        
    }

    private static int iMin(float[] Array, int[] Sorting) {
        float min = Float.MAX_VALUE;
        int imin = -1;
        
        for (int indexArray: Sorting) {
            if (Array[indexArray] < min)
            {
                imin = indexArray;
                min = Array[imin];
            }
        }
        
        return imin;
    }

    private static int[] arrrayRemoveAt(int[] Sorting, int indexSorting) {
        int[] arrayNew = new int[Sorting.length-1];
        
        if (indexSorting == 0)
            arrayNew = Arrays.copyOfRange(Sorting, 1, Sorting.length);
        
        if (indexSorting > 0 && indexSorting < Sorting.length-1)
        {
            for (int i = 0; i < indexSorting; i++) {
                arrayNew[i] = Sorting[i];
            }
            
            for (int i = indexSorting+1; i < Sorting.length; i++) {
                arrayNew[i-1] = Sorting[i];
            }
        }
        
        if (indexSorting == Sorting.length-1)
            arrayNew = Arrays.copyOfRange(Sorting, 0, Sorting.length-1);
        
        return arrayNew;
    }

    private static int indexSorting(int[] Sorting, int indexArray) {
        for (int i = 0; i < Sorting.length; i++) {
            if (Sorting[i] == indexArray)
                return i;
        }
        
        return -1;
    }
    
}
