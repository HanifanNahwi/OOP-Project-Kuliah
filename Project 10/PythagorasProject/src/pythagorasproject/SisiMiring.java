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
public class SisiMiring {
    double x,y;
    
    void SM() {
        Scanner SM = new Scanner(System.in);
        System.out.println("Masukan Sisi A = ");
        x = SM.nextDouble();
        System.out.println("Masukan Sisi B = ");
        y = SM.nextDouble();

        HitungSisiMiring miring = new HitungSisiMiring();
        miring.a = x;
        miring.b = y;

        System.out.println("Sisi Miring Segitiga = " + miring.HitungSM());
    }
}
