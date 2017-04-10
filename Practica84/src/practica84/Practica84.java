/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84;

/**
 *
 * @author pablo
 */
public class Practica84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    pitagoras p1 = new pitagoras();
    p1.pedircateto1();
    p1.pedircateto2();
    p1.calculohipo();
    System.out.println("La hipotenusa es igual a: "+ p1.gethipo());
    }
    
}
