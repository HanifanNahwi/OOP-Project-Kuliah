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
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inp;
        double a,b,c,d,e,f,x,y;
        System.out.println("Program Pythagoras");
        System.out.println("1.Cek triple pythagoras");
        System.out.println("2.Menentukan sisi miring segitiga");
        System.out.println("3.Menentukan sisi siku-siku segitiga");
        System.out.println("4.Exit");
        
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Pilih Nomor : ");
        inp = input.nextInt();
        
        switch (inp) {
            case 1:
                CekTriple r = new CekTriple ();
                r.CT();
                break;
                
            case 2:
                SisiMiring p = new SisiMiring ();
                p.SM();
                break;
                
            case 3:
                SisiSiku q = new SisiSiku();
                q.SS();
                break;
                
            case 4:
                System.exit(0);
        }
    }
}
