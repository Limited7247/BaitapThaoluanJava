/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import LtdTools.LtdString;

/**
 *
 * @author Limited
 */
public class Student {
    private LtdString Hoten;
    private float dTinhoc;

    public Student() {
        this.Hoten = new LtdString("");
        this.dTinhoc = 0;
    }
    
    public Student(String Hoten, float dTinhoc) {
        this.Hoten = new LtdString(Hoten);
        this.dTinhoc = dTinhoc;
    }
    
    @Override
    public String toString() {
        if (this.isEmpty())
            return "";
        else
            return "Họ tên: " + Hoten.toString() + ", Điểm Tin học: " + dTinhoc + ".";
    }
    
    public boolean isEmpty()
    {
        return this.Hoten.string == null;
    }
    
    public void Delete()
    {
        this.Hoten.string = null;
        this.dTinhoc = 0;
    }
  
}
