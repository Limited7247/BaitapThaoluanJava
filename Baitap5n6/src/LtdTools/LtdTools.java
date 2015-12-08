/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LtdTools;

/**
 *
 * @author Limited
 */
public class LtdTools {

    /**
     * Ước chung lớn nhất của hai số x, y
     * @param x
     * @param y
     * @return UCLN(x, y)
     */
    public int UCLN(int x, int y)
    {
        x = Math.abs(x);
        y = Math.abs(y);
        
        if ((x == 0) || (y == 0))
            return x+y;
        
        if (x % y == 0)
            return y;
        else
            return UCLN(y, x%y); 
    }
    
    /**
     * Bội chung nhỏ nhất của hai số x, y
     * @param x
     * @param y
     * @return BCNN(x, y)
     */
    public int BCNN(int x, int y)
    {
        return x/UCLN(x, y)*y;
    }
    
    /**
     * Tổng các chữ số của một số Nguyên
     * @param x Một số Nguyên
     * @return Tổng các chữ số
     */
    public int TongCacChuSo(int x)
    {
        x = Math.abs(x);
        int T = 0;
        
        do
        {
            T += x % 10;
            x /= 10;
        } while ((x % 10 != 0) || (x / 10 != 0));
        
        ///T += x % 10;
        
        return T;
    }
    
    public boolean PrimeNumber(int X)
    {
        if (X < 2) return false;
        
        for (int i = 2; i < X; i++) {
            if (X % i == 0) return false;
        }
        
        return true;
    }
    
    public int PrimeNumberN(int N)
    {
        if (N <= 0 ) return 0;
        
        int index = PrimeNumberN(N-1) + 1;
        
        while (!PrimeNumber(index)) index++;
        
        return index;
    }
}


