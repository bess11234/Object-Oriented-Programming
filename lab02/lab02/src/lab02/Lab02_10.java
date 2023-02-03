package lab02;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bess1123
 */
import java.util.Scanner;
public class Lab02_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money: ");
        double salary = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase): ");
        char chr = sc.next().charAt(0);
        if (chr == 'A' || chr == 'C'){salary = salary*1.015;}else if(chr == 'B'){salary = salary*1.02;}
        else if(chr == 'X'){salary = salary*1.05;}
        int Intsalary = (int)salary;
        System.out.println("Your total money in one year = "+Intsalary);
    }
}
