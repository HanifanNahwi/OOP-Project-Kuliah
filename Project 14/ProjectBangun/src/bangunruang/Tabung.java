/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Hanifan
 */
public class Tabung extends BangunRuang{
    // atribut jari-jari
    public double r,t;
    private final double phi = 22/7;
     
    // method untuk hitung luas lingkaran
    public double hitungVolume(){
        double Volume = phi * r * r * t;
        return Volume;
    }
    
    // method untuk hitung keliling
    public double hitungLuasPermukaan(){
 	double LuasPermukaan = phi * 2 * r * (r + t);
        return LuasPermukaan;
    }
}
