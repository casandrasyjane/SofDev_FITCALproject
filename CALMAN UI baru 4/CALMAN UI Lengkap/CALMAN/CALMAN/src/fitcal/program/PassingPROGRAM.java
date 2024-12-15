/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class PassingPROGRAM {
    //untuk menyimpan program terpilih dalam variabel
    private static String prog;
    
    
    //metode untuk mendapatkan nilai dari variabel program terpilih dari sign in
    public static String getPROGRAM() {
        return prog;
    }
    
    //metode publik untuk mengatur perubahan nilai program terpilih dari sign in
    public static void setPROGRAM(String newPROGRAM) {
        prog = newPROGRAM;
    }
}
