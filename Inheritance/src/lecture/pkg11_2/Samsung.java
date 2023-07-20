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
public class Samsung extends Mobile {
    
          public int z;                //عرفنا متغير خاص بكلاس Samsung
    
// نفس الشرح السابق تماماً, لكن هنا يمكنك القول أننا ذكرنا ما حدث بتفصيل
    public Samsung() {              // Samsung عند استخدام هذا الكونستركتور لإنشاء كائن من الكلاس
        super();              // Mobile سيتم إستدعاء كونستركتور الكلاس
        z = 123;
        x = 9;         //9 هنا سيتم تبديل قيمة اكس في كلاس سامسونج بالقيمة
                       //50 مع العلم أنها ستبقى 
                      //مع اي كائن في كلاس موبايل
    }
    
}
