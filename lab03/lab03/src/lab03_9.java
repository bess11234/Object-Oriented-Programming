/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bess1123
 */
import java.util.Scanner;
public class lab03_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = sc.nextInt();
        String text = "";
        for (int c=1; c<=num; c++){
            if (c%5 == 0){text += "|\n";}else{text += "|";}
        }
        System.out.println(text);
    }
}
