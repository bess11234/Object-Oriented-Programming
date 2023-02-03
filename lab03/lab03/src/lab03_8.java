/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bess1123
 */
import java.util.Scanner;
public class lab03_8 {
    public static void main(String[] args) {
        String text="";
        Scanner sc = new Scanner(System.in);
        int stop = sc.nextInt();
        for (int c=1; c <=stop; c++){
            if (c%5==0){
                text += "/";
            }else{
                text += "|";
            }
        }
        System.out.println(text);
    }
}
