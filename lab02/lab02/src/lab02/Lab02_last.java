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
public class Lab02_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pay = 375.99;
        System.out.println("please insert your monitor size 38 or 43 only");
        int tmp = sc.nextInt();
        if (tmp == 38){pay += 75.99;}else if(tmp == 43){pay += 99.99;}
        System.out.println("Do you want DVD-ROM? 1 is Yes / 0 is No");
        int tmp1 = sc.nextInt();
        if (tmp1 == 1){pay += 65.99;}
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        int tmp2 = sc.nextInt();
        if (tmp2 == 1){pay += 125;}
        System.out.println("======= Your order =======");
        System.out.println("*computer >>> 375.99$");
        if (tmp == 38){System.out.println("*38'Monitor >>> 75.99$");}else if(tmp == 43){System.out.println("*43'Monitor >>> 99.99$");}
        if (tmp1 == 1){System.out.println("*DVD-ROM >>> 65.99$");}
        if (tmp2 == 1){System.out.println("*printer >>> 125.00$");}
        System.out.println("======= Total price >>> "+pay+" =======");
    }
}
