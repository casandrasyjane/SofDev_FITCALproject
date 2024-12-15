/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class Passingkarbo {
    //untuk menyimpan tinggi badan dalam variabel
    private static String totalkarbo;
    
    
    //metode untuk mendapatkan nilai dari variabel tinggi badan dari sign in
    public static String getkarbo() {
        return totalkarbo;
    }
    
    //metode publik untuk mengatur perubahan nilai tinggi badan dari sign in
    public static void setkarbo(String newkarbo) {
        totalkarbo = newkarbo;
    }
}
