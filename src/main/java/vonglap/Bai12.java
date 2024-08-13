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
public class Bai12 {
    public static void main(String[] args) {
       int n[]=new int[]{32,2,73,23,76,1};
       
       int min=n[0];
       int max=n[0];
       
        for(int i=0;i<n.length;i++){
            if(n[i]<min){
                min=n[i];
            }
            if(n[i]>max){
                max=n[i];
            }
        }
        System.out.println("So be nhat la: "+min);
        System.out.println("So lon nhat la: "+max);
            
        }
    }
