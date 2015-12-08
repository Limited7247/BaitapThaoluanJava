/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Limited
 */
public class Officer extends Employee {
    private float Ratio;
    private int DaysOff;
    
    public Officer()
    {
        super();
        this.Ratio = 0;
        this.DaysOff = 0;
    }
    
    /**
     * Lương nhân viên Văn phòng
     * @return Ratio*1050000 + Subsidy() - SalaryDeduction()
     */
    @Override
    public long Salary() {return (long) (Ratio*1050000 + Subsidy() - SalaryDeduction());}

    private long SalaryDeduction() {return (long) (DaysOff*(Ratio*1050000)/20);}

    @Override
    public void ReadDialog() {
        JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin Nhân viên Văn phòng", "Nhập thông tin Nhân viên Văn phòng", JOptionPane.INFORMATION_MESSAGE);
        super.ReadDialog();
        this.Ratio = Float.parseFloat(JOptionPane.showInputDialog(null, "Hệ số lương: ", "Nhập thông tin Nhân viên", JOptionPane.QUESTION_MESSAGE));
        this.DaysOff = Integer.parseInt(JOptionPane.showInputDialog(null, "Số ngày nghỉ trong tháng: ", "Nhập thông tin Nhân viên", JOptionPane.QUESTION_MESSAGE));
    }
}
