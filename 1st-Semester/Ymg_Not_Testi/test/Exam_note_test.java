/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static junit.framework.Assert.assertEquals;
import ymg_not_testi.Metodlar;


/**
 *
 * @author PC
 */
public class Exam_note_test {

    
    @Test
    public void avg_generate()
    {
        Metodlar ogrenci_notu = new Metodlar(80,40);
        double avg_note = ogrenci_notu.avg_generate();
        System.out.println(" Not "+avg_note);
        
        assertEquals(56.0,avg_note);
    }
    
    //yanlis ise 
    @Test
    public void avg1_generate()
    {
        Metodlar ogrenci_notu = new Metodlar(40,80);
        double avg_note = ogrenci_notu.avg_generate();
        System.out.println("Not"+avg_note);
        
        assertEquals(63.0,avg_note);
    }
    
    //harf ile notların gösteriminin testleri
    
    @Test
    public void avg2_generate()//başarılı test
    {
        Metodlar ogrenci_notu = new Metodlar(80,40);
        String note = ogrenci_notu.result();
        System.out.println("Not "+note);
        
        assertEquals("FD",note);
        
        
    }
    
    @Test
    public void avg3_generate()
    {
        Metodlar ogrenci_notu = new Metodlar(80,40);
        String note = ogrenci_notu.result();
        System.out.println("Not"+note);
        
        assertEquals("AA",note);
    }
    
    
    
    
}
