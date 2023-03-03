/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bess1123
 */
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){super(0, "");}
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    public void withdraw(double a){
        if ((this.balance - a) >= 0 || (this.balance - a + this.credit) >= 0){
            if (this.balance - a >= 0){
                this.balance -= a;
            }else if ((this.balance - a + this.credit) >= 0){
                a = this.balance - a;
                this.balance = 0;
                this.credit -= a;
            }
            System.out.println(a+" baht is withdrawn from "+name+" and your credit balance is "+credit+".");
        }else{
            System.out.println("Not enough money!");
        }
    }
    public void withdraw(String a){
        withdraw(Double.parseDouble(a));
    }
    public String toString(){
        return "The "+name+" account has "+balance+" baht and "+credit+" credits.";
    }
}
