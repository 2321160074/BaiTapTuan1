/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MSI_PC
 */
public class Bai15 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Random Rd = new Random();
        
        int Solandoan = 0;
        int Solandoandung = 0;
        String playAgain;

        do {
            int songaunhien = Rd.nextInt(11);  // Số ngẫu nhiên từ 0-10
            System.out.print("Nhap mot so tu 0 den 10: ");
            int Docso = Sc.nextInt();
            Solandoan++;

            if (Docso == songaunhien) {
                Solandoandung++;
                System.out.println("Co diem!Ban da doan dung");
            } else {
                System.out.println("Sai roi,So dung la: " + songaunhien);
            }

            System.out.print("(Ban co muon tiep tuc khong?Nhap e de ket thuc hoac nhan bat ky phim khac de tiep tuc): ");
            playAgain = Sc.next();
            
        } while (!playAgain.equalsIgnoreCase("e"));

        // Thống kê kết quả
        System.out.println("Tro choi ket thuc!");
        System.out.println("So lan doan: " + Solandoan);
        System.out.println("So lan doan dung: " + Solandoandung);
        if (Solandoan > 0) {
            double Tiledoantrungbinh = (double) Solandoandung / Solandoan * 100;
            System.out.printf("Ti le doan dung trung binh: %.2f%%\n", Tiledoantrungbinh);
        } else {
            System.out.println("Ban chua thuc hien lan doan nao.");
        }

    }
    }
    
