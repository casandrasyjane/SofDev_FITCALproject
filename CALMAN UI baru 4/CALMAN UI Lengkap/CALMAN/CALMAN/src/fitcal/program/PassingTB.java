/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class PassingTB {
    //untuk menyimpan tinggi badan dalam variabel
    private static String tb;
    
    
    //metode untuk mendapatkan nilai dari variabel tinggi badan dari sign in
    public static String getTB() {
        return tb;
    }
    
    //metode publik untuk mengatur perubahan nilai tinggi badan dari sign in
    public static void setTB(String newTB) {
        tb = newTB;
    }
}
