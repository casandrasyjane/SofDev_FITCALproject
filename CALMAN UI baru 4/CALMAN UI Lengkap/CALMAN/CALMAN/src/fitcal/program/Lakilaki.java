/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcal.program;

public class Lakilaki implements KebutuhanKalori{

    //polymorphism
    @Override
    public double hitungKebutuhanKalori(double beratBadan, double tinggiBadan, int usia) {
        //perhitungan untuk perempuan
         return (10 * beratBadan) + (6.25 * tinggiBadan) - (5 * usia) + 5;
    }
    
}
