/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import LtdTools.LtdString;
import javax.swing.JOptionPane;

/**
 *
 * @author Limited
 */
public abstract class Employee {
    protected LtdString Name;
    protected int Age;
    protected int FirstYear;
    protected long Subsidy() {return 200000 + 30000*(2015-FirstYear);}
    abstract long Salary();
    
    public Employee()
    {
        this.Name = new LtdString();
        this.Age = 0;
        this.FirstYear = 0;
    }
    
    public void ReadDialog() {
        this.Name = new LtdString(JOptionPane.showInputDialog(null, "Họ tên:", "Nhập thông tin Nhân viên", JOptionPane.QUESTION_MESSAGE));
        this.Age = Integer.parseInt(JOptionPane.showInputDialog(null, "Tuổi: ", "Nhập thông tin Nhân viên", JOptionPane.QUESTION_MESSAGE));
        this.FirstYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Năm vào Công ty: ", "Nhập thông tin Nhân viên", JOptionPane.QUESTION_MESSAGE));
    }
    
}
