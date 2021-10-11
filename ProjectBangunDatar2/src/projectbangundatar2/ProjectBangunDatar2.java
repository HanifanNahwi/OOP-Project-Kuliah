/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Hanifan
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // HITUNG LUAS DAN KELILING 
        
        // PERSEGI PANJANG
        PersegiPanjang a = new PersegiPanjang();
        System.out.println(a.Luas(10, 5));
        System.out.println(a.Keliling(10, 5));
                
        System.out.println(a.Luas(3.6, 8));
        System.out.println(a.Keliling(3.6, 8));
                
        System.out.println(a.Luas(6, 8.3));
        System.out.println(a.Keliling(6, 8.3));
        
        System.out.println(a.Luas(5.6, 8.8));
        System.out.println(a.Keliling(5.6, 8.8));
        
        // PERSEGI
        Persegi b = new Persegi();
        System.out.println(b.Luas(4.5));
        System.out.println(b.Keliling(4.5));
        
        System.out.println(b.Luas(7));
        System.out.println(b.Keliling(7));
        
        // LINGKARAN 
        Lingkaran c = new Lingkaran();
        System.out.println(c.Luas(5));
        System.out.println(c.Keliling(5));
        
        System.out.println(c.Luas(7.4));
        System.out.println(c.Keliling(7.4));
        
        // SEGITIGA 
        Segitiga d = new Segitiga();
        System.out.println(d.Luas(8, 10));
        System.out.println(d.Keliling(8, 10));
        
        System.out.println(d.Luas(8, 11.5));
        System.out.println(d.Keliling(8, 11.5));
        
        System.out.println(d.Luas(12.2, 9));
        System.out.println(d.Keliling(12.2, 9));
        
        System.out.println(d.Luas(13.9, 20.7));
        System.out.println(d.Keliling(13.9, 20.7));
        
    }
    
}
