/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rename;

/**
 *
 * @author Cristane
 */
public class A {
    int A;
    String AA;
    B ClassB;
    
    public int getA(){
        return A;
    }
    
    public void setA(int A){
        System.out.println("classe A");
        this.A = A;
        ClassB.setB(A);
        ClassB.BB = "String";
        ClassB.setB(A);
    }
    
}
