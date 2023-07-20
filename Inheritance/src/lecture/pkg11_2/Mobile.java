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
public class Mobile {
    
    public int x;
    public int y;
 
    // Mobile هنا قمنا بتعريف الكونستركتور الإفتراضي للكلاس
    // سيتم تنفيذه بشكل تلقائي في أي كلاس يرث منه .Mobile و بما أنه لا يوجد غيره في الكلاس
    public Mobile() {
        x = 50;
        y = 100;
    }
    
}
