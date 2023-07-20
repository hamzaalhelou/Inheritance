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
public class Main_car {
    
    public static void main(String[] args) {
 
        // Car من أجل عرض قيم المتغيرات التي ورثها من الكلاس Kia هنا قمنا بإنشاء كائن من الكلاس
        // الأولوية في بناء اوبجيكت من كلاس الابن هي استدعاء كونستركتور الاب ومن ثم كونستركتور الابن
        Kia b = new Kia();
        b.setX(10);
       
        System.out.println("x: " + b.getX());
        System.out.println("y: " + b.y);
 
    }
    
}
