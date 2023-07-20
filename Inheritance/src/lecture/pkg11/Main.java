/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg11;

/**
 *
 * @author moatasem
 */
public class Main {
    
    public static void main(String[] args) {
        
           // أم لا A لنتأكد إذا كان يحتوي على الأشياء الموجودة في الكلاس B هنا قمنا بإنشاء كائن من الكلاس
        B b = new B();
 
        // A من الكلاس B التي ورثها الكلاس printA() هنا قمنا باستدعاء الدالة
        b.printA();
 
        // أيضا يمكننا إعطائه قيمة و عرض قيمته x يملك متغير إسمه b و بما أن الكائن
        b.x = 123;
        System.out.println("x: " + b.x);
 
    }
}
    

