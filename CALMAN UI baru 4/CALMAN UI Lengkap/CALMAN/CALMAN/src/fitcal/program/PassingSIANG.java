/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class PassingSIANG {
    //untuk menyimpan makan siang dalam variabel
    private static String si;
    
    
    //metode untuk mendapatkan nilai dari variabel makan siang dari sign in
    public static String getSIANG() {
        return si;
    }
    
    //metode publik untuk mengatur perubahan nilai makan siang dari sign in
    public static void setSIANG(String newSIANG) {
        si = newSIANG;
    }
}
