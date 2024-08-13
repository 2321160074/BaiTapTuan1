/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

/**
 *
 * @author ADMIN
 */
public class Bai13 {
    public static void main(String[] args) {
            
        // Duyệt tất cả các số từ 10 đến 99
        for (int num = 10; num <= 99; num++) {
            // Tách chữ số hàng chục và chữ số hàng đơn vị
            int hangchuc = num / 10;   // Chữ số hàng chục
            int donvi = num % 10;  // Chữ số hàng đơn vị
            
            // Tính tích và tổng của hai chữ số
            int tich = hangchuc * donvi;
            int tong = hangchuc + donvi;
            
            // Kiểm tra điều kiện: tích bằng 2 lần tổng
            if (tich == 2 * tong) {
                // In số thoả mãn điều kiện
                System.out.println("So thoa man la"+num);
            }
        }
    }
    }
          
