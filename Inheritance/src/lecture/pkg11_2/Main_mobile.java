/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg11_2;

/**
 *
 * @author moatasem
 */
public class Main_mobile {
    
     public static void main(String[] args) {
 
        // Mobile من أجل عرض قيم المتغيرات التي ورثها من الكلاس Samsung هنا قمنا بإنشاء كائن من الكلاس
        Samsung b = new Samsung();
       
 
        System.out.println("In class Samsung we have:");
        System.out.println("x: " + b.x);
        System.out.println("y: " + b.y);
        System.out.println("z: " + b.z);
 
        System.out.println();
 
        // من أجل التأكد من أن قيم متغيراته لا تتأثر إذا تم تغيير نفس المتغيرات في أي كلاس يرث منه mobile هنا قمنا بإنشاء كائن من الكلاس
        Mobile a = new Mobile();
 
        System.out.println("In class Mobile we have:");
        System.out.println("x: " + a.x);   // Samsung الموجود في الكلاس x مختلفة عن قيمة المتغير Mobile الموجود في الكلاس x لاحظ كيف أن قيمة المتغير
        System.out.println("y: " + a.y);
 
    }
 
    }
    

