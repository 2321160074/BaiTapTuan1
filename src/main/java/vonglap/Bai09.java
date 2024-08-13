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
public class Bai09 {
    public static void main(String[] args) {
        int n;
        int souoc;
        
        Scanner QN=new Scanner(System.in);
        System.out.println("Nhap so n:");
        n=QN.nextInt();
        souoc=0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                souoc++;
            }
        }
        System.out.println("So uoc cua "+n+" la "+souoc);
    }
    
}
