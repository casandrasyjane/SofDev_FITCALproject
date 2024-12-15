/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class Passingtotprotein {
    //untuk menyimpan tinggi badan dalam variabel
    private static String totprotein;
    
    
    //metode untuk mendapatkan nilai dari variabel tinggi badan dari sign in
    public static String gettotprotein() {
        return totprotein;
    }
    
    //metode publik untuk mengatur perubahan nilai tinggi badan dari sign in
    public static void settotprotein(String newtotprotein) {
        totprotein = newtotprotein;
    }
}
