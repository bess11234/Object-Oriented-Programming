/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author bess1123
 */
public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public String toFloat(){
        double num = (double)topN/(double)btmN;
        return ""+num;
    }
    public void addFraction(Fraction f){
        if (f.btmN == btmN){topN = topN+f.topN;}else{topN = topN*f.btmN+f.topN*btmN;btmN *= f.btmN;}
    }
    public boolean myEquals(Fraction f){
        double num1 = (double)topN/(double)btmN;
        double num2 = (double)f.topN/(double)f.btmN;
        if (num1 == num2){return true;}else{return false;}
    }
    public void LowestTermFrac(){
        int tmp = topN;
        for (int i=2;i!=tmp;i++){
            while (true){
                if (topN%i == 0 && btmN%i == 0){
                topN /= i;
                btmN /= i;
                }else{break;}
            }
        }
    }
}
