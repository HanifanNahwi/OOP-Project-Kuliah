/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;

/**
 *
 * @author Hanifan
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayProcessing p = new ArrayProcessing();
        while(true){
            int x;
            System.out.println("---- Menu Data Array List : ----");
            System.out.println("1.Tambah data");
            System.out.println("2.Cari Data");
            System.out.println("3.Hapus Data");
            System.out.println("4.Tampil Data");
            System.out.println("5.Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("Pilih Program (nomer)= ");
            x = input.nextInt();

            switch (x) {
                case 1:
                    p.tambahData();
                    break;
                case 2:
                    p.cariData();
                    break;
                case 3:
                    p.hapusData();
                    break;
                case 4:
                    p.tampilData();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    
}
