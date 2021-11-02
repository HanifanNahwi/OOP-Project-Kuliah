/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author Hanifan
 */
public class SisiSiku {
    double x,y;
    void SS() {
        Scanner sisi = new Scanner(System.in);
        System.out.println("Masukan Sisi A = ");
        x = sisi.nextDouble();
        System.out.println("Masukan Sisi C = ");
        y = sisi.nextDouble();

        HitungSisi Sb = new HitungSisi();
        Sb.a = x;
        Sb.c = y;

        System.out.println("Panjang Sisi Segitiga (B) yg belum diketahui = " + Sb.HitungSisi());
    }
}
