/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Hanifan
 */
public class Lingkaran extends BangunDatar{
 
    public double r;
    private final double phi = 22/7;
     
    public double hitungLuas(){
        double luas = phi * r * r;
        return luas;
    }
    
    public double hitungKeliling(){
 	double keliling = phi * 2 * r;
        return keliling;
    }
}
