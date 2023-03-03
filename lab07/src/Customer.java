/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bess1123
 */
public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer(){
        this("", "");
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return this.acct;
    }
    public String toString(){
        String tmp;
        if (acct == null){
            tmp = this.getFirstName()+" "+this.getLastName()+" doesn’t have account.";
        }else{
            tmp = "The "+this.getFirstName()+" account has "+this.getAcct().getBalance()+" baht and "+this.getAcct().getCredit()+" credits.";
        }
        return tmp;
    }
    public boolean equals(Customer c){
        if (this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName)){
            return true;
        }else{return false;}
    }
}
