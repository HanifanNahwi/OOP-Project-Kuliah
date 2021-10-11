/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Hanifan
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Operasi a = new Operasi();
        double jumlah1 = a.jumlahkan(3, 4);
        double jumlah2 = a.jumlahkan(4, 7, -9);
        double jumlah3 = a.jumlahkan(3.4, -0.002, 0.12313);
        
        System.out.println("Jumlahnya adalah :" + jumlah1);
        System.out.println("Jumlahnya adalah :" + jumlah2);
        System.out.println("Jumlahnya adalah :" + jumlah3);
    }
    
}
