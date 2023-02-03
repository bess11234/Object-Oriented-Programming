/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bess1123
 */
import java.util.Scanner;
public class lab03_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter height of tower : ");
        int height = sc.nextInt();
        for (int c=0;c != height;c++){
            System.out.println("#-#-#-#-#");
        }
    }
}
