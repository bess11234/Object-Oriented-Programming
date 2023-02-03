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
public class Lab02_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        int work = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        int absent = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        int weight = sc.nextInt();
        int salary;
        if (age >= 21 & age <= 30){
            salary = (work*300)-(absent*50);
        }else if(age >= 31 & age <= 40){
            salary = (work*500)-(absent*50);
        }else if(age >= 41 & age <= 50){
            salary = (work*1000)-(absent*25);
        }else if(age >= 51 & age <= 60){
            salary = (work*3000);
        }else{salary = 0;}
        System.out.println("Hi, "+name);
        System.out.println("Your salary is "+salary+" Baht");
        if (weight >= 10 & weight <= 60){
            salary += 5000;
        }else if (weight >= 61 & weight <= 90){
            salary += 5000-((weight-60)*10);
        }
        System.out.println("Your salary and bonus is "+salary+" Baht");
    }
}
