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
public class CekTriple {
    double a,b,c;

    void CT() {
        Scanner real = new Scanner(System.in);
        System.out.println("Masukan Alas = ");
        a = real.nextDouble();
        System.out.println("Masukan Tinggi = ");
        b = real.nextDouble();
        System.out.println("Masukan Miring = ");
        c = real.nextDouble();

        double Sc,Sab;
        Sc = c*c;
        Sab = (a*a) + (b*b);

        if (Sab == Sc) {
            System.out.println("ini merupakan pythagoras");
        } else {
            System.out.println("ini bukan pythagoras");
        }
    }
}
