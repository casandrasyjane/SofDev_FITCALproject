/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class PassingAKTIVITAS {
    //untuk menyimpan aktivitas terpilih dalam variabel
    private static String akt;
    
    
    //metode untuk mendapatkan nilai dari variabel aktivitas terpilih dari sign in
    public static String getAKTIVITAS() {
        return akt;
    }
    
    //metode publik untuk mengatur perubahan nilai aktivitas terpilih dari sign in
    public static void setAKTIVITAS(String newAKTIVITAS) {
        akt = newAKTIVITAS;
    }
}
