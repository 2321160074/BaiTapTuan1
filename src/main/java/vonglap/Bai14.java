/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI_PC
 */
public class Bai14 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        double tong = 0;
        int danhsachcacso = 0;

        System.out.println("Nhap cac so(Nhap 0 de Ket thuc):");

        while (true) {
            double num = scanner.nextDouble();
            if (num == 0) {
                break;
            }
            numbers.add(num);
            tong += num;
            danhsachcacso++;
        }

        if (danhsachcacso == 0) {
            System.out.println("Khong co so duoc nhap.");
        } else {
            double trungbinh = tong / danhsachcacso;
            System.out.printf("Trung binh bang: %.3f\n", trungbinh);
        }

    }
    }

