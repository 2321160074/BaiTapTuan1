/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapMang1Chieu;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] a;
        int n;
        Scanner Sc = new Scanner(System.in);
        Random Rd = new Random();

        // Nhập số phần tử của mảng
        System.out.print("Nhap so phan tu (1 <= n <= 20): ");
        n = Sc.nextInt();

        // Kiểm tra điều kiện số phần tử
        if (n < 1 || n > 20) {
            System.out.println("So phan tu phai nam trong khoang 1 den 20.");
            return;
        }

        a = new int[n];

        // Phát sinh mảng số nguyên ngẫu nhiên
        for (int i = 0; i < a.length; i++) {
            a[i] = Rd.nextInt(100) + 1; // Sinh số ngẫu nhiên từ 1 đến 100
        }

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(a);

        // Xuất mảng đã sắp xếp
        System.out.print("Mang sau khi sap xep tang dan: ");
        for (int item : a) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Nhập số nguyên x
        System.out.print("Nhap so nguyen x: ");
        int x = Sc.nextInt();

        // Liệt kê các phần tử là ước số của x
        System.out.print("Cac phan tu la uoc so cua " + x + ": ");
        boolean timthay = false;
        for (int num : a) {
            if (x % num == 0) { // Kiểm tra số là ước số của x
                System.out.print(num + " ");
                timthay = true;
            }
        }

        if (!timthay) {
            System.out.print("Khong co uoc so nao.");
        }
        System.out.println();
    }
}

