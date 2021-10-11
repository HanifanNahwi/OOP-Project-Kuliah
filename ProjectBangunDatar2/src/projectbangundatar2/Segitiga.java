/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Hanifan
 */
public class Segitiga {
    // Hitung Luas
    int Luas(int a, int t){
        return (a * t)/2;
    }
    double Luas(int a, double t){
        return (a * t)/2;
    }
    double Luas(double a, int t){
        return (a * t)/2;
    }
    double Luas(double a, double t){
        return (a * t)/2;
    }
    
    // Hitung Keliling Segitiga Sama Kaki
    double Keliling(int a, int t){
        double s = Math.sqrt( Math.pow((a/2), 2) + Math.pow(t, 2) );
        return a + (2* s);
    }
    double Keliling(double a, double t){
        double s = Math.sqrt( Math.pow((a/2), 2) + Math.pow(t, 2) );
        return a + (2* s);
    }
}
