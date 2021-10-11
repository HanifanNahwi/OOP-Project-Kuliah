/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Hanifan
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Project 1
        // Hitung Luas Lingkaran
        Lingkaran a = new Lingkaran();
        a.jari = 21;
        
        // Hitung Luas Persegi
        Persegi b = new Persegi();
        b.sisi = 42;
        
        // Hitung Luas Bangun Kompleks
        double jumlah = (2 * a.hitungLuas()) + b.hitungLuas();
        System.out.println("Luas Project 1 adalah : " + jumlah);
        
        
        // Project 2
        // Hitung Lingkaran Besar
        Lingkaran x = new Lingkaran();
        x.jari = 14;
        
        // Hitung Lingkaran Kecil
        Lingkaran y = new Lingkaran();
        y.jari = 7;
        
        // Hitung Luas Bangun Kompleks
        double Luas = (x.hitungLuas()/2) - y.hitungLuas();
        System.out.println("Luas Project 2 adalah : " + Luas);
                
    }
   
    
    
}
