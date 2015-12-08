/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap17;

import java.util.Scanner;
import model.Student;

/**
 *
 * @author Limited
 */
public class Baitap17 {

    /**
     * @param args the command line arguments
     */
    static Student[] Class = new Student[5];
    
    public static void main(String[] args) {
        // TODO code application logic here
        Initialization();
        
        ShowClass();
        
        DeleteStudent();
        
        ShowClass();
        
         
    }

    private static void Initialization() {
        
        Class[0] = new Student("Nguyễn Thu Phương", (float)1.5);
        Class[1] = new Student("Lê Tuấn Đạt", (float)9.2);
        Class[2] = new Student("Phạm Thị Anh Thư", (float)4.5);
        Class[3] = new Student("Phạm Anh Tuấn", (float)7.3);
        Class[4] = new Student("Hoàng Thu Trang", (float)6.46);
            
    }

    private static void ShowClass() {
        System.out.println("Danh sách sinh viên: ");
        for (int i = 0; i < Class.length; i++) 
            if (!Class[i].isEmpty())
                System.out.println(Class[i].toString());
        System.out.println(""); 
        
    }

    private static void DeleteStudent() {
        Scanner jin = new Scanner(System.in);
        System.out.print("Nhập vào Mã sinh viên muốn xóa (0..4): "); int x = jin.nextInt();
        if (0 <= x && x <= 4)
            Class[x].Delete();
        else
            System.out.println("Mã số không hợp lệ!");
       
        System.out.println("");
    }
    
}
