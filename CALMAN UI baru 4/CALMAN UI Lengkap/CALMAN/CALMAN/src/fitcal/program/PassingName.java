/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

/**
 *
 * @author user
 */
public class PassingName {
    
    //untuk menyimpan nama dalam variabel
    private static String name;
    
    
    //metode untuk mendapatkan nilai dari variabel name dari sign in
    public static String getName() {
        return name;
    }
    
    //metode publik untuk mengatur perubahan nilai name dari sign in
    public static void setName(String newName) {
        name = newName;
    }
}
