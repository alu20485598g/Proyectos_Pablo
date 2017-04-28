/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84;

import java.util.Scanner;

/**
 * Clase pitagoras. Encontramos diferentes métodos los cuales nos permitirá 
 * pedir los diferentes catetos y calcular la hipotenusa.
 * @author pablo
 */
public class pitagoras {
    private float cateto1;
    private float cateto2;
    private float hipo;
   /**Método que pide al usuario el primer cateto.
     * 
     */
    public void pedircateto1(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame el primer cateto: ");
        cateto1 = teclado.nextFloat();
    }
    /**Método que pide al usuario el segundo cateto.
     * 
     */
    public void pedircateto2(){
        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Dame el segundo cateto: ");
        cateto2 = teclado2.nextFloat();
    }
    /**Método que calcula la hipotenusa del triángulo.
     * 
     */
    public void calculohipo(){
        hipo = (float) Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));
    }
    /**Método que devuelve el valor de la hipotenusa del triángulo.
     * 
     */
    public float gethipo(){
        return hipo;
    }
}
