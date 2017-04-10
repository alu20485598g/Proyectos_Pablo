/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class pitagoras {
    private float cateto1;
    private float cateto2;
    private float hipo;
    
    public void pedircateto1(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame el primer cateto: ");
        cateto1 = teclado.nextFloat();
    }
    public void pedircateto2(){
        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Dame el segundo cateto: ");
        cateto2 = teclado2.nextFloat();
    }
    public void calculohipo(){
        hipo = (float) Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));
    }
    
    public float gethipo(){
        return hipo;
    }
}
