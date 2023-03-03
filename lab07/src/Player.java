/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bess1123
 */
public abstract class Player{
    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;
    
    public double getHP(){
        return this.HP;
    }
    public void setHP(double HP){
        this.HP = HP;
        if (this.HP < 0){
            this.HP = 0;
        }
    }
    public double getMP(){
        return this.MP;
    }
    public void setMP(double MP){
        this.MP = MP;
    }
    public double getEXP(){
        return this.EXP;
    }
    public void setEXP(double EXP){
        this.EXP = EXP;
    }
    public double getMoney(){
        return this.Money;
    }
    public void setMoney(double Money){
        this.Money = Money;
    }
    public double getATK(){
        return this.ATK;
    }
    public void setATK(double ATK){
        this.ATK = ATK;
    }
    public String toString(){
        return "HP : "+HP+" MP : "+MP+" ATK : "+ATK;
    }
    public abstract void attack(Player p);
    public abstract void attacked(double n);
}
