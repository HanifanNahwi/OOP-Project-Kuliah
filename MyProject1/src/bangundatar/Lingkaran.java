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
public class Lingkaran {
    
    //atribut
    public int jarijari;
    public String soal;
    
    //methods
    public void hitungLuas(){
        double hasil = 3.14 * jarijari * jarijari;
        System.out.println("Luas Lingkaran " + soal +"     :"+ hasil);
    }

    public void hitungKeliling(){
        double hasil = 2* 3.14 * jarijari;
        System.out.println("Keliling Lingkaran "+ soal + " :" + hasil);
    }
}
