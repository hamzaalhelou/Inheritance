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
public class Kia extends Car {
    
     // أي عند إنشاء كائن منه Kia عند استدعاء الكونستركتور الإفتراضي للكلاس
    // حتى و إن لم نقم باستدعائه Car سيتم إستدعاء الكونستركتور الإفتراضي الموجود في الكلاس
    public Kia(){
        System.out.println("kia Constructor {sub class}");
    }
}
