/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author Hanifan
 */
public class HitungSisiMiring {
    double Sc,Smiring,a,b;
    
    double HitungSM(){
        Sc = (a*a) + (b*b);
        Smiring = (Math.sqrt(Sc));
        return Smiring;
    }
}
