/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testingApp;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 *
 * @author SB 604-16
 */
public class SoalTest extends TestCase{
    private static Soal s = new Soal();
    
    /*
     * test case 1: melakukan pengujian apakah 
     * nilai kembalian dari method pangkat bernilai null atau tidak
    */       
    public void testNotNullPangkat(){        
        assertNotNull("Hasilnya tidak Null",s.pangkat(10, 2));
    }
}