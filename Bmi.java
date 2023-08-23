/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;
   
/**
 *
 * @author AZZAHRA
 */
public class Bmi {
    public static void main(String[] args) {
      String nama = "Azzahra Ayudita";
      int umur = 15;
      double tb = 1.60;
      int bb = 41;
      double bmi;
      
        System.out.println("nama:"+nama);
        System.out.println("umur:"+umur);
        System.out.println("tb:"+tb);
        System.out.println("bb:"+bb);
        
        bmi= (bb/(tb*tb));
        
        if(bmi <18.5){
            System.out.println(String.format("BMI: %.2f", bmi));
            System.out.println("kurus");
        }
        else if (bmi <24.9){
            System.out.println(String.format("BMI: %.2f", bmi));
            System.out.println("normal");
        }
        else if (bmi <29.9){
            System.out.println(String.format("BMI: %.2f", bmi));
            System.out.println("gemuk");
        }
        else{
            System.out.println(String.format("BMI: %.2f", bmi));
            System.out.println("obesitas");
        }
    }
}        