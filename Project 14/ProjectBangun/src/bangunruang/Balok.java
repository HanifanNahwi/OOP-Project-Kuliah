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
public class Balok extends BangunRuang{
    // atribut jari-jari
    public double panjang,lebar,tinggi;
     
    // method untuk hitung luas lingkaran
    public double hitungVolume(){
        double Volume =  panjang * lebar * tinggi;
        return Volume;
    }
    
    // method untuk hitung keliling
    public double hitungLuasPermukaan(){
 	double LuasPermukaan = 2*((panjang * lebar)+(panjang * tinggi)+(lebar * tinggi));
        return LuasPermukaan;
    }
}
