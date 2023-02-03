/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author bess1123
 */
import java.util.Scanner;
public class Lab02_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        double pay;
        if (salary > 50000.00){
            pay = salary*0.1;
        }else{
            pay = salary*0.05;
        }
        System.out.println("You have to pay: "+pay);
    }
}
