/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapMang1Chieu;
import java.util.Scanner;

/**
 *
 * @author MSI_PC
 */
public class Bai17 {
    public static void main(String[] args) {
        //Khai bao mang luu so nguyen
        double[]a;
        int n;
        Scanner Sc=new Scanner(System.in);
        //Đọc số phần tử từ bàn phím
        System.out.print("Cho biet so phan tu:");
        n=Sc.nextInt();
        a=new double[n];
        
        nhapMang(a,Sc);
        System.out.print("\nMang so thuc:");
        xuatMang(a);
        
        double tb=tinhTb(a);
        System.out.print("\nGia tri trung binh:"+tb);
        
        double min=timMin(a);
        System.out.print("\nGia tri nho nhat:"+min);
       
    }
    //định nghĩa phuong thuc nhap mang

    private static void nhapMang(double[] a, Scanner Sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhap a["+i+"]:");
            a[i]=Sc.nextDouble();
            
        }
     }
    //định nghĩa phương thức xuất mảng
    private static void xuatMang(double[] a) {
        for(double item:a){
            System.out.println(item+ " ");
        }
    }
    //định nghĩa phương thức tính trung bình
    private static double tinhTb(double[] a) {
        double tong = 0;
        for (int i = 0; i < a.length; i++) {  // Lặp qua các phần tử trong mảng
            tong += a[i];
        }
        double tb = tong / a.length;  // Tính trung bình giá trị
        return tb;
    }

    //phương thức tìm phần tử nhỏ nhất mảng
    private static double timMin(double[] a) {
             double min = a[0];
        for (double x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
        
    }
    

