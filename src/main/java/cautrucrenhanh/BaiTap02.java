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
public class BaiTap02 {
    public static void main(String[] args)
    {
        double toan,van,anh;
        double dtb;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Xét Học Lực=======");
        System.out.print("Cho biết điểm toán:");
        toan=sc.nextDouble();
        System.out.println("Cho biết điểm văn:");
        van=sc.nextDouble();
        System.out.println("Cho biết điểm anh");
        anh=sc.nextDouble();
       
        //B2.Tinh trung bìnhlo
         dtb=(toan+van+anh)/3;
         //b3.Xet hoc luc
         String kq="";
         if(dtb<=4){
             kq="yeu";
         }else if(dtb<=6.5){
                     kq="Trung Binh";
         } else if(dtb<=8){
                     kq="Kha";
         }  else{
                     kq="Gioi"; 
         }   
        //b4.Xuat KQ
        System.out.println("DTB:"+dtb+"-Hoc luc"+ kq);
    }
  
}
