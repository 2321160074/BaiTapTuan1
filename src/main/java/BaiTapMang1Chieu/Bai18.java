/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapMang1Chieu;
import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        // Khai báo mảng lưu số thực
        double[] a;
        int n;
        Scanner Sc = new Scanner(System.in);

        // Đọc số phần tử từ bàn phím
        System.out.print("Cho biet so phan tu: ");
        n = Sc.nextInt();
        a = new double[n];

        nhapMang(a, Sc);
        System.out.print("\nMang so thuc:");
        xuatMang(a);

        // Liệt kê các phần tử không phải số nguyên tố
        System.out.print("\nCac phan tu khong phai so nguyen to: ");
        lietKeKhongPhaiSoNguyenTo(a);

        // Tính giá trị trung bình của các số nguyên tố
        double tbNguyenTo = tinhTbSoNguyenTo(a);
        System.out.println("\nGia tri trung binh cua cac so nguyen to: " + tbNguyenTo);
    }

    // Định nghĩa phương thức nhập mảng
    private static void nhapMang(double[] a, Scanner Sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = Sc.nextDouble();
        }
    }

    // Định nghĩa phương thức xuất mảng
    private static void xuatMang(double[] a) {
        for (double item : a) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Phương thức kiểm tra số nguyên tố
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    // Phương thức liệt kê các phần tử không phải số nguyên tố
    private static void lietKeKhongPhaiSoNguyenTo(double[] a) {
        boolean found = false;
        for (double num : a) {
            if (num == (int) num && !isPrime((int) num)) { // Kiểm tra số nguyên và không phải số nguyên tố
                System.out.print((int) num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Khong co phan tu nao.");
        }
        System.out.println();
    }

    // Phương thức tính giá trị trung bình của các số nguyên tố
    private static double tinhTbSoNguyenTo(double[] a) {
        double tong = 0;
        int dem = 0;

        for (double num : a) {
            if (num == (int) num && isPrime((int) num)) {
                tong += num;
                dem++;
            }
        }

        return (dem == 0) ? 0 : tong / dem;
    }
}
