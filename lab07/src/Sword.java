/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bess1123
 */
public class Sword extends Item{
    public void use(Player P){
        P.setATK(P.getATK()+10);
    }
}
