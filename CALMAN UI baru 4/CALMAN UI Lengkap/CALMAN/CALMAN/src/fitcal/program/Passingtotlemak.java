/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class Passingtotlemak {
    //untuk menyimpan tinggi badan dalam variabel
    private static String totlemak;
    
    
    //metode untuk mendapatkan nilai dari variabel tinggi badan dari sign in
    public static String gettotlemak() {
        return totlemak;
    }
    
    //metode publik untuk mengatur perubahan nilai tinggi badan dari sign in
    public static void settotlemak(String newtotlemak) {
        totlemak = newtotlemak;
    }
}
