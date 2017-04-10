/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica83;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ecuacion2 {
    private float resultado1;
    private float resultado2;
    private float a;
    private float b;
    private float c;
    private float raiz;
    
    public void pedira(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame a(x2): ");
        a = teclado.nextFloat();
    }
    
    public void pedirb(){
        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Dame b(x): ");
        b = teclado2.nextFloat();
    }
    
    public void pedirc(){
        Scanner teclado3 = new Scanner(System.in);
        System.out.print("Dame c(número): ");
        c = teclado3.nextFloat();
    }
    
    public void calculoraiz(){
        raiz = (float) Math.sqrt(Math.pow(b , 2) + (-4 * a * c ));
    }
    
    public void resultado1(){
        resultado1 = (-b + raiz) / (2 * a);        
    }
    public float getresultado1(){
        return resultado1;
    }
    
    public void resultado2(){
        resultado2 = (-b - raiz) / (2 * a);
        
    }
    public float getresultado2(){
        return resultado2;
    }
}
