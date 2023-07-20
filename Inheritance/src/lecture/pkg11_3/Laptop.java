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

//وجود أكثر من كونستركتور في الـ Superclass

public class Laptop {
    
    public int x;
    public int y;
 
    // عند استدعائه y و x يحتوي على كونستركتور يسمح بتمرير قيم أولية للمتغيرات Laptop الكلاس
    // لأنه لا يوجد كونستركتور لا يحتوي على باراميترات Subclass هنا يجب استدعاء هذا الكونستركتور في أي
    public Laptop(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}
