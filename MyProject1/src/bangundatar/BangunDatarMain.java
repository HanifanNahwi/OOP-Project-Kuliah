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
public class BangunDatarMain {
    
    public static void main(String[] args) {
        //PersegiPanjang
        PersegiPanjang op1 = new PersegiPanjang();
        op1.panjang = 25;
        op1.lebar = 38;
        op1.hitungLuas();
        op1.hitungKeliling();
        
        System.out.println("<============================>");
        
        //Persegi
        Persegi op2 = new Persegi();
        op2.sisi = 10;
        op2.soal = "A";
        op2.hitungLuas();
        op2.hitungKeliling();
        
        op2.sisi = 15;
        op2.soal = "B";
        op2.hitungLuas();
        op2.hitungKeliling();
        
        System.out.println("<============================>");
        
        //Lingkaran
        Lingkaran op3 = new Lingkaran();
        op3.jarijari = 25;
        op3.soal = "A";
        op3.hitungLuas();
        op3.hitungKeliling();
        
        op3.jarijari = 37;
        op3.soal = "B";
        op3.hitungLuas();
        op3.hitungKeliling();
    }
}
