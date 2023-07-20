/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg11_1;

/**
 *
 * @author moatasem
 */

//طريقة إستدعاء كونستركتور لا يحتوي باراميترات من الـ   
//Superclass

public class Car {
    
    private int x;
    public int y;
 
    // Car هنا قمنا بتعريف الكونستركتور الإفتراضي للكلاس
    // سيتم تنفيذه بشكل تلقائي في أي كلاس يرث منه Car و بما أنه لا يوجد غيره في الكلاس
    public Car() {
       
        y = 100;
        System.out.println("Car constructor {super class}");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    
    
}
