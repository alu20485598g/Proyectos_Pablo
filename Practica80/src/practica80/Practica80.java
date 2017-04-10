/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica80;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Practica80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float l;
    areac ac = new areac();
    Scanner teclado = new Scanner (System.in);
    System.out.println("Dame el radio: ");
    l = teclado.nextFloat();
    System.out.println("El área lateral es "+ ac.getareal(l) +" m2");
    System.out.println("El área total es "+ ac.getareat(l) +" m2");
    }
    
}
