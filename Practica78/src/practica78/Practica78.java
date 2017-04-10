/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica78;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Practica78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float h;
    float b;
    float resula;
    areat at = new areat();
    Scanner teclado = new Scanner (System.in);
    System.out.println("Dame la base: ");
    b = teclado.nextFloat();
    Scanner teclado2 = new Scanner (System.in);
    System.out.println("Dame la altura: ");
    h = teclado.nextFloat();
    resula= at.getarea(b, h);
    System.out.println("El área es "+ resula +" m2");
    }
    
}
