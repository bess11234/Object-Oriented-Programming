/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bess1123
 */
public class Ship extends Vehicle implements Floatable{
    public Ship(){
        super(0);
    }
    public Ship(double fuel){
        super(fuel);
    }
    public void move(){
        fl0at();
    }
    public void move(int distance){
        for (;distance!=0;distance-=1){
            fl0at();
            if (this.fuel < 50){
                System.out.println("Fuel is not enough.");
                break;
            }
        }
    }
    public void fl0at(){
        if (this.fuel >= 50){
            this.fuel -= 50;
            System.out.println("Ship moves");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void startEngine(){
        if (this.fuel >= 10){
            this.fuel -= 10;
            System.out.println("Engine starts");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    public void honk(){
        System.out.println("Shhhhh");
    }
}
