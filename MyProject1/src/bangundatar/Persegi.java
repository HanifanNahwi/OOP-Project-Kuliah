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
public class Persegi {
    
    //atribut
    public int sisi;
    public String soal; 
    
    
    //methods
    public void hitungLuas(){
        int hasil = sisi * sisi;
        System.out.println("Luas Persegi "+ soal + "     :" +hasil);
    }

    public void hitungKeliling(){
        int hasil = 4*sisi;
        System.out.println("Keliling Persegi " + soal + " :" +hasil);
    }
}
