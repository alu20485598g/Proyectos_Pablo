/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica83;

import java.util.Scanner;

/**
 * Clase ecuacion2. Encontramos diferentes métodos los cuales nos permitirá 
 * pedir las diferentes variables y resolver la ecuación.
 * @author pablo
 */
public class ecuacion2 {
    private float resultado1;
    private float resultado2;
    private float a;
    private float b;
    private float c;
    private float raiz;
    /**Método que pide al usuario la variable a.
     * 
     */
    public void pedira(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame a(x2): ");
        a = teclado.nextFloat();
    }
    /**Método que pide al usuario la variable b.
     * 
     */
    public void pedirb(){
        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Dame b(x): ");
        b = teclado2.nextFloat();
    }
    /**Método que pide al usuario la variable c.
     * 
     */
    public void pedirc(){
        Scanner teclado3 = new Scanner(System.in);
        System.out.print("Dame c(número): ");
        c = teclado3.nextFloat();
    }
    /**Método que calcula la parte de la raíz de la ecuación de 2º grado.
     * 
     */
    public void calculoraiz(){
        raiz = (float) Math.sqrt(Math.pow(b , 2) + (-4 * a * c ));
    }
    /**Método que calcula el primer resultado de la ecuación.
     * 
     */
    public void resultado1(){
        resultado1 = (-b + raiz) / (2 * a);        
    }
    /**Método que devuelve el primer resultado de la ecuación.
     * 
     */
    public float getresultado1(){
        return resultado1;
    }
    /**Método que calcula el segundo resultado de la ecuación.
     * 
     */
    public void resultado2(){
        resultado2 = (-b - raiz) / (2 * a);
        
    }
    /**Método que devuelve el segundo resultado de la ecuación.
     * 
     */
    public float getresultado2(){
        return resultado2;
    }
}
