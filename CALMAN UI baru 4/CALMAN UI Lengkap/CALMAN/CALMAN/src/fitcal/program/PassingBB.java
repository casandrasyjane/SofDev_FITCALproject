/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class PassingBB {
    //untuk menyimpan berat badan dalam variabel
    private static String bb;
    
    
    //metode untuk mendapatkan nilai dari variabel berat badan dari sign in
    public static String getBB() {
        return bb;
    }
    
    //metode publik untuk mengatur perubahan nilai berat badan dari sign in
    public static void setBB(String newBB) {
        bb = newBB;
    }
}
