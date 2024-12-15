/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class PassingMalam {
    //untuk menyimpan makan malam dalam variabel
    private static String mal;
    
    
    //metode untuk mendapatkan nilai dari variabel makan malam dari sign in
    public static String getMALAM() {
        return mal;
    }
    
    //metode publik untuk mengatur perubahan nilai makan malam dari sign in
    public static void setMALAM(String newMALAM) {
        mal = newMALAM;
    }
}
