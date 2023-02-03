/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bess1123
 */
import java.util.Scanner;
public class lab03_7 {
    public static void main(String[] args) {
        int Even=0, Odd=0;
        Scanner sc = new Scanner(System.in);
        while (true){
            int num = sc.nextInt();
            if (num == -1){break;}
            if (num%2 == 0){Even++;}else{Odd++;}
        }
        System.out.println("Odd number = "+Odd+" and Even number = "+Even);
    }
}
