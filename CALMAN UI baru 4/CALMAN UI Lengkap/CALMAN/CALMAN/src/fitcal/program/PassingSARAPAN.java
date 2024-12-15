/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class PassingSARAPAN {
    //untuk menyimpan sarapan dalam variabel
    private static String sar;
    
    
    //metode untuk mendapatkan nilai dari variabel sarapan dari sign in
    public static String getSARAPAN() {
        return sar;
    }
    
    //metode publik untuk mengatur perubahan nilai sarapan dari sign in
    public static void setSARAPAN(String newSARAPAN) {
        sar = newSARAPAN;
    }
}
