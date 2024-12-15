/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class Passingprotein {
    //untuk menyimpan tinggi badan dalam variabel
    private static String totalprotein;
    
    
    //metode untuk mendapatkan nilai dari variabel tinggi badan dari sign in
    public static String getprotein() {
        return totalprotein;
    }
    
    //metode publik untuk mengatur perubahan nilai tinggi badan dari sign in
    public static void setprotein(String newprotein) {
        totalprotein = newprotein;
    }
}
