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
public class BaiTap06 {
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        char pheptinh;
       
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so nguyen thu nhat: ");
            a=sc.nextInt();
            System.out.println("Nhap so nguyen thu 2: ");
            b=sc.nextInt();
            System.out.println("Nhap phep tinh(+,-,*,/): ");
          pheptinh = sc.next().charAt(0);
         
          if (pheptinh == '+'){
              System.out.println("ket qua: " + (a + b));
          }else if (pheptinh == '-'){
              System.out.println("ket qua: " + (a - b));
          }else if (pheptinh == '*'){
              System.out.println("ket qua: " + (a * b));
          }else if (pheptinh =='/'){
              if(b != 0){
                  System.out.println("ket qua: "+ ((double) a / b));
              }else {
                  System.out.println("khong the chia cho 0!?");
              }
          }else{
              System.out.println("phep toan khong hop le!");
          }
         
    }
    }

