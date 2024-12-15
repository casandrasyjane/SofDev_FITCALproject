/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class PassingKebutuhanKalori {
    //untuk menyimpan berat badan dalam variabel
    private static String kk;
    
    
    //metode untuk mendapatkan nilai dari variabel berat badan dari sign in
    public static String getkk() {
        return kk;
    }
    
    //metode publik untuk mengatur perubahan nilai berat badan dari sign in
    public static void setkk(String newk) {
        kk = newk;
    }
}
