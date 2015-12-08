/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LtdTools;

import java.util.Scanner;

/**
 *
 * @author Limited
 */
public class ArrayInteger {
    private int[] Elem;
    
    public ArrayInteger()
    {
        this.Elem = new int[0];
    }
    
    public ArrayInteger(int x)
    {
        this.Elem = new int[x];
        for (int i = 0; i < Elem.length; i++)
            Elem[x] = 0;

    }
    
    public ArrayInteger(ArrayInteger arrayinteger)
    {
        this.Elem = new int[arrayinteger.Elem.length];
        for (int i = 0; i < arrayinteger.Elem.length; i++) {
            this.Elem[i] = arrayinteger.Elem[i];
            
        }
    }
    
    public void Set(int x)
    {
        this.Elem = new int[x];
        for (int i = 0; i < Elem.length; i++)
            Elem[i] = 0;
    }
    
    public void SetElem(int x, int k)
    {
        if (k <= 0) k = 0;
        if (k >= 100) k = 99;
        
        this.Elem[x] = k;
    }
    
    public void Read()
    {
        Scanner jin = new Scanner(System.in);
        System.out.print("Nhập vào, n = "); int n = jin.nextInt();
        this.Set(n);
        
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < Elem.length; i++) {
            System.out.print("A[" + i + "] = "); 
            this.SetElem(i, jin.nextInt());
        }
        System.out.println("");
    }
    
    public void Show()
    {
        System.out.println("Dãy số: ");
        for (int i = 0; i < this.Elem.length; i++) 
            System.out.print(this.Elem[i] + " ");
        System.out.println("");
        System.out.println("");
    }
    
    public class Max
    {
        public int Value;
        public int index;
    }
    
    public Max Max()
    {
        Max max = new Max();
        max.Value = Integer.MIN_VALUE;
        max.index = -1;
        
        for (int i = 0; i < Elem.length; i++) {
            if (Elem[i] > max.Value)
            {
                max.Value = Elem[i];
                max.index = i;
            }
            
        }
        
        return max;
    }
    
    public Max SecondMax()
    {
        ArrayInteger temp = new ArrayInteger(this);
        for (int i = 0; i < temp.Elem.length; i++) {
            if (temp.Elem[i] == this.Max().Value)
                temp.Elem[i] = Integer.MIN_VALUE;
        }
        
        return temp.Max();
    }
    
    public void SortDESC()
    {
        for (int i = 0; i < Elem.length-1; i++) {
            for (int j = i+1; j < Elem.length; j++) {
                if (Elem[i] < Elem[j])
                {
                    int temp = Elem[i];
                    Elem[i] = Elem[j];
                    Elem[j] = temp;
                }
                
            }
        }
    }
    
    public void InsertDESC(int x)
    {
        this.SortDESC();
        for (int i = 0; i < Elem.length; i++) {
            if (Elem[i] <= x)
            {
                Elem[i] = x;
                return;
            }
            
        }
    }
}
