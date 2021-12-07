/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import bangunruang.Tabung;
import bangunruang.Balok;
import bangunruang.Bola;
/**
 *
 * @author Hanifan
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persegi per = new Persegi();
        per.sisi = 10;
        System.out.println("Persegi dengan sisi " + per.sisi);
        per.tampilHasil();
        
        System.out.println("\n");
        Lingkaran o = new Lingkaran();
        o.r = 7;
        System.out.println("Lingkaran dengan jari jari " + o.r);
        o.tampilHasil();
        
        System.out.println("\n");
        Tabung t = new Tabung();
        t.r = 7;
        t.t = 10;
        System.out.println("Lingkaran dengan jari jari " + t.r + "dan tinggi" + t.t);
        t.tampilHasil();
        
        System.out.println("\n");
        Balok x = new Balok();
        x.lebar=5;
        x.panjang=10;
        x.tinggi=3;
        System.out.println("Persegi dengan panjang "+ x.panjang+" ,lebar "+ x.lebar+ " ,dan tinggi " + x.tinggi);
        x.tampilHasil();
        
        System.out.println("\n");
        Bola y = new Bola();
        y.r = 7;
        System.out.println("Lingkaran dengan jari jari " + o.r);
        y.tampilHasil();
    }
    
}
