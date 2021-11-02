/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hanifan
 */
public class GameClass {
    Random rnd = new Random();
    int n = rnd.nextInt(100);
    
    void input() {
        int x;
        Scanner yn = new Scanner(System.in);
        int bil = 0;
        do{
            bil++;
            System.out.println("Masukan Tebakan Anda :");
            x = yn.nextInt();
            if(x>n) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            } else if(x<n){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
            }
        }while(x!=n);
    }
}
