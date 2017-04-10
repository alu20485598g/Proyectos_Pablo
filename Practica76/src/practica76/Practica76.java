/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica76;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Practica76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int aux;
    float num1;
    float num2;
    float resul;
    Calculadora c = new Calculadora();
    Scanner teclado = new Scanner(System.in);
    System.out.println("Dime que operación quieres realizar:");
    System.out.println("1.Sumar");
    System.out.println("2.Restar");
    System.out.println("3.Multiplicar");
    System.out.println("4.Dividir");
    System.out.println("5.Salir");
    System.out.println();
    aux = teclado.nextInt();
    
    if (aux <= 0 || aux > 5){
        System.out.println("No me has escogido una opción correcta.");
    }    
    else{
        
        while (aux > 0 && aux < 5){
            Scanner teclado3 = new Scanner(System.in);
            System.out.print("Dime el primer número: ");
            num1=teclado3.nextFloat();
            Scanner teclado4 = new Scanner(System.in);
            System.out.print("Dime el segundo número: ");
            num2=teclado4.nextFloat();
            switch (aux){
                case 1:
                    resul = c.suma(num1, num2);                    
                    System.out.println("Resultado: "+ resul);
                    System.out.println();
                break;
                case 2: 
                    resul = c.resta(num1, num2);                    
                    System.out.println("Resultado: "+ resul);
                    System.out.println();
                break;
                case 3: 
                    resul = c.multi(num1, num2);                    
                    System.out.println("Resultado: "+ resul);
                    System.out.println();
                break;
                case 4: 
                    resul = c.divi(num1, num2);                    
                    System.out.println("Resultado: "+ resul);
                    System.out.println();
                break;
            }
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("¿Qué quieres hacer ahora?");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println();
            aux = teclado2.nextInt();
            if (aux <= 0 || aux > 5){
                System.out.println("No me has escogido una opción correcta.");
            }   
        }
    }
    if (aux == 5){
            System.out.println("Saliendo de la calculadora...");
        }
    }
}