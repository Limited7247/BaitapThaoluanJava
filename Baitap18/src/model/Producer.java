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
public class Producer extends Employee {
    private int Products;

    public Producer()
    {
        super();
        this.Products = 0;
    }
    
    /**
     * Lương nhân viên Sản xuất
     * @return Products*100000 + Subsidy()
     */
    @Override
    public long Salary() {return Products*100000+Subsidy();}
    
    @Override
    public void ReadDialog()
    {
        JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin Nhân viên Sản xuất", "Nhập thông tin Nhân viên Sản xuất", JOptionPane.INFORMATION_MESSAGE);
        super.ReadDialog();
        this.Products = Integer.parseInt(JOptionPane.showInputDialog(null, "Số sản phẩm đã nộp trong tháng: ", "Nhập thông tin Nhân viên", JOptionPane.QUESTION_MESSAGE));
    }
}
