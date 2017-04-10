/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica77;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Practica77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float r;
    float resull;
    float resula;
    areayl ayl = new areayl();
    Scanner teclado = new Scanner (System.in);
    System.out.println("Dame el radio: ");
    r = teclado.nextFloat();
    resull = ayl.getlongitud(r);
    resula = ayl.getarea(r);
    System.out.println("El área es "+ resula +" m2");
    System.out.println("El perímetro es "+ resull +" m");
    }  
}
