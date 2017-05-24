/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica86_2;

import java.util.Scanner;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase contador, donde crearemos diferentes objetos para los dos contadores 
 * (c1 y c2).
 * @author pablo
 */
public class Practica86_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux;
        int aux2;
        int aux3=0;
        /*Primer menú para escoger con que contador queremos trabajar*/
        while (aux3!=3){
        Scanner teclado00 = new Scanner(System.in);
        System.out.println("¿Con que contador quieres trabajar?");
        System.out.println("1-Contador Nº1.");
        System.out.println("2-Contador Nº2.");
        System.out.println("3-Salir del programa.");
        aux3=teclado00.nextInt();
        /*Si cumple la primera condición del if trabajará con el contador 1*/
        if (aux3==1){
        /*Creamos el primer objeto de la clase contador*/    
        contador c1 = new contador();
        Scanner teclado01 = new Scanner(System.in);
        System.out.print("Dime con que valor quieres inicializar el "
                + "contador: ");
        aux=teclado01.nextInt();
        c1.setcontador(aux);
        /*Segundo menú para realizar una operación u otra*/
        Scanner teclado02 = new Scanner(System.in);
        System.out.println("Dime que quieres hacer con el contador:");
        System.out.println("1-Incrementarlo.");
        System.out.println("2-Decrementarlo.");
        aux2=teclado02.nextInt();
        switch(aux2){
            case 1:
                Scanner teclado03 = new Scanner(System.in);
                System.out.println("¿Cuántas veces quieres incrementarlo?");
                aux=teclado03.nextInt();
                for (int i=0; i<aux; i++){
                    c1.incrementar();
                }
                System.out.println("El valor actual del contador es de: "+ 
                        c1.getcontador());
            break;
            case 2:
                Scanner teclado04 = new Scanner(System.in);
                System.out.println("¿Cuántas veces quieres decrementarlo?");
                aux=teclado04.nextInt();
                for (int i=0; i<aux; i++){
                    c1.decrementar();
                }
                System.out.println("El valor actual del contador es de: "+ 
                        c1.getcontador());
            break;
        }
        }
        /*La segunda condición del if nos permitirá trabajr con el segundo 
        contador, repetimos la estructura de menús de la primera condición*/
        if (aux3==2){
        contador c2 = new contador();
        Scanner teclado01 = new Scanner(System.in);
        System.out.print("Dime con que valor quieres inicializar el "
                + "contador: ");
        aux=teclado01.nextInt();
        c2.setcontador(aux);
        
        Scanner teclado02 = new Scanner(System.in);
        System.out.println("Dime que quieres hacer con el contador:");
        System.out.println("1-Incrementarlo.");
        System.out.println("2-Decrementarlo.");
        aux2=teclado02.nextInt();
        switch(aux2){
            case 1:
                Scanner teclado03 = new Scanner(System.in);
                System.out.println("¿Cuántas veces quieres incrementarlo?");
                aux=teclado03.nextInt();
                for (int i=0; i<aux; i++){
                    c2.incrementar();
                }
                System.out.println("El valor actual del contador es de: "+ 
                        c2.getcontador());
            break;
            case 2:
                Scanner teclado04 = new Scanner(System.in);
                System.out.println("¿Cuántas veces quieres decrementarlo?");
                aux=teclado04.nextInt();
                for (int i=0; i<aux; i++){
                    c2.decrementar();
                }
                System.out.println("El valor actual del contador es de: "+ 
                        c2.getcontador());
            break;
        }
        }
        
        
    if (aux3 == 4){
            System.out.println("Saliendo del programa...");
        }
        }
    
    }
    
}
