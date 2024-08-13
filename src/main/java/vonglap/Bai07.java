/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai07 {
    public static void main(String[] args) {
        int thang,nam;
        int Songay=0;
        
        Scanner QN=new Scanner(System.in);
        
        
        //b1.Đọc tháng,năm từ người dùng
        System.out.println("Tinh so ngay cua thang");
        System.out.print("Cho biet thang:");
        thang=QN.nextInt();
        System.out.print("Cho biet nam:");
        nam=QN.nextInt();
        //b2.Xét tháng để tính ngày
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                Songay=31;
                break;
            case 2:
                if(nam%4==0){
                    Songay=29;
                }else{
                    Songay=28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                Songay=30;
                break;
              default:
                  System.out.print("Thang khong hop le");
        }
        //b3.Xuất kết quả
        System.out.println("Thang "+thang+" Nam "+nam+" Co "+Songay+" Ngay");
    }
}
