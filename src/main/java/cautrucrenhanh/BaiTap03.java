/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cautrucrenhanh;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap03 {
    public static void main(String[] args) {
        int so1,so2,so3;
        
        Scanner QN=new Scanner(System.in);
        System.out.println("Tim so nho nhat");
        System.out.println("Nhap so thu nhat:");
        so1=QN.nextInt();
        System.out.println("Nhap so thu hai:");
        so2=QN.nextInt();
        System.out.println("Nhap so thu ba:");
        so3=QN.nextInt();
        
        int min=so1;
        if(so2<so1){
            min=so2;
        }
        if(so3<min){
            min=so3;
        }
        System.out.println("So nho nhat la "+min);
    }
    
}
