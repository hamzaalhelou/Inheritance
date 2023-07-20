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
public class Hp extends Laptop {
    
     // Laptop هنا يجب تعريف كونستركتور واحد على الأقل يستدعي الكونستركتور الموجود في الكلاس
 
    // Superclass Laptop هنا قمنا بتعريف كونستركتور يمرر القيمتين 123 و 456 في كونستركتور الـ
    public Hp() {
        super(123, 444);
    }
 
    // Superclass Laptop هنا قمنا بتعريف كونستركتور نمرر له قيمتين عند استدعائه فيقوم بدوره بتمريرهما في كونستركتور الـ
    public Hp(int p1, int p2) {
        super(p1, p2);
    }
    
}
