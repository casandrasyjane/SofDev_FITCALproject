/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class Passingtotkarbo {
    //untuk menyimpan tinggi badan dalam variabel
    private static String totkarbo;
    
    
    //metode untuk mendapatkan nilai dari variabel tinggi badan dari sign in
    public static String gettotkarbo() {
        return totkarbo;
    }
    
    //metode publik untuk mengatur perubahan nilai tinggi badan dari sign in
    public static void settotkarbo(String newtotkarbo) {
        totkarbo = newtotkarbo;
    }
}
