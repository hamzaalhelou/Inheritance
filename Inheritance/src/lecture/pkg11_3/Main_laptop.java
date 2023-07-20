/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg11_3;

/**
 *
 * @author moatasem
 */

public class Main_laptop {
    
    public static void main(String[] args) {
 
        // الذي لا يأخذ باراميترات Hp باستخدام كونستركتور الكلاس Hp هنا قمنا بإنشاء كائن من الكلاس
        Hp b1 = new Hp();
        System.out.println("Here the constructor generate these values for the object b1:");
        System.out.println("x: " + b1.x);
        System.out.println("y: " + b1.y);
 
        System.out.println();
 
        // الذي يأخذ 2 باراميتر Hp باستخدام كونستركتور الكلاس Hp هنا قمنا بإنشاء كائن من الكلاس
        Hp b2 = new Hp(47,13);
        System.out.println("Here the constructor generate these values for the object b2:");
        System.out.println("x: " + b2.x);
        System.out.println("y: " + b2.y);
 
    }
    
    
    
}
