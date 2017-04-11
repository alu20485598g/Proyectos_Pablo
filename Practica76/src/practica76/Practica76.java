/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica76;

import java.util.Scanner;

/**
 * Clase principal. Encontraremos el diseño del menú y de las diferentes
 * opciones que contará nuestra calculadora.
 * @author pablo
 */
public class Practica76 {

    /**
     * 
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
    /* Declaramos las variables aux, num1, num2, resul */
    /** @param aux Variable para llevar el control de la opción del menú.
     * @param num1 Variable para guardar el valor del primer número.
     * @param num2 Variable para guardar el valor del segundo número.
     * @param resul Variable para guardar el valor del relsultado de la operación.
     */
    int aux;
    float num1;
    float num2;
    float resul;
    /* Hacemos llamada a la clase calculadora mediante el objeto c.*/
    Calculadora c = new Calculadora();
    /* Creamos un menú para que el usuario nos devuelva la opción deseada. */ 
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
        /* Creamos un bucle while hasta que el usuario nos devuelva la 
        opción 5 que es la de salir de la calculadora. */
        while (aux > 0 && aux < 5){
            /* Pedimos al usuario que nos de un valor para num1 y num2 */
            Scanner teclado3 = new Scanner(System.in);
            System.out.print("Dime el primer número: ");
            num1=teclado3.nextFloat();
            Scanner teclado4 = new Scanner(System.in);
            System.out.print("Dime el segundo número: ");
            num2=teclado4.nextFloat();
            /* Con el switch podremos realizar una operacion diferente según la 
            opción que el usuario ha introducido previamente */
            switch (aux){
                case 1:
                    /* A través del objeto podremos hacer una llamada al método
                    suma de la clase calculadora pasandole los valores de num1 
                    y num2, guardando asi el resultado que nos devuelva el 
                    método en la variable resul. */
                    resul = c.suma(num1, num2);                    
                    System.out.println("Resultado: "+ resul);
                    System.out.println();
                break;
                case 2:
                    /* Igual que para la suma tendremos el método resta. */
                    resul = c.resta(num1, num2);                    
                    System.out.println("Resultado: "+ resul);
                    System.out.println();
                break;
                case 3:
                    /* Método multi. */
                    resul = c.multi(num1, num2);                    
                    System.out.println("Resultado: "+ resul);
                    System.out.println();
                break;
                case 4: 
                    /* Método divi. */
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