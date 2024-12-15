/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class PassingCAMILAN {
    //untuk menyimpan makanan camilan dalam variabel
    private static String cam;
    
    
    //metode untuk mendapatkan nilai dari variabel makanan camilan dari sign in
    public static String getCAMILAN() {
        return cam;
    }
    
    //metode publik untuk mengatur perubahan nilai makanan camilan dari sign in
    public static void setCAMILAN(String newCAMILAN) {
        cam = newCAMILAN;
    }
}
