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
public class Bai08 {
    public static void main(String[] args) {
       int n;
       int tong;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so n:");
        n=sc.nextInt();
        
        tong=0;
        
        for(int i=1;i<=n;i++){
            tong+=i;
        }
 System.out.println("Tổng các số nguyên từ 1 đến " +n  + " là: " + tong);
             
    }
}
