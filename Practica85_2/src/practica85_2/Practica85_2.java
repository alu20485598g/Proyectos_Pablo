/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase cuenta, donde crearemos diferentes objetos para las tres cuentas 
 * (c1, c2 y c3) y crearemos un ArrayList de las cuentas, y la clase Menu, 
 * donde podremos elegir las diferentes opciones.
 * @author pablo
 */
public class Practica85_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Creamos el primer objeto a través de la clase cuenta. También crearemos 
    el ArrayList de las cuentas de tamaño 3.*/
    ArrayList<cuenta> cuentas = new ArrayList(3);
    cuenta c1 = new cuenta("Pablo","Hontoria","Cruz","20485598G",100000,4,1);
    /*Copiaremos el tipo de interés del titular (Como indica el constructor 
    copia de la clase cuenta)*/
    cuenta c2 = new cuenta(c1);
    cuenta c3 = new cuenta(c1);
    /*Agregamos las cuentas al ArrayList*/
    cuentas.add(c1);
    cuentas.add(c2);
    cuentas.add(c3);
    /*Introduciremos los nuevos datos de la cuenta Nº2 y Nº3*/
    System.out.println("Los datos de la cuenta Nº1 ya han sido introducidos."
            + " Ahora introduzca los datos de las otras dos cuentas.");
    
    String n;
    float s;
    for (int i=0;i<2;i++){
        if(i==0){
            System.out.println();
            System.out.println("Introducción de los datos de la cuenta Nº2: ");
            Scanner teclado01 = new Scanner(System.in);
            System.out.print("Dime el nombre del titular: ");
            n=teclado01.next();
            cuentas.get(1).setnombre(n);
            Scanner teclado02 = new Scanner(System.in);
            System.out.print("Dime el primer apellido del titular: ");
            n=teclado02.next();
            cuentas.get(1).setapellido1(n);
            Scanner teclado03 = new Scanner(System.in);
            System.out.print("Dime el segundo apellido del titular: ");
            n=teclado03.next();
            cuentas.get(1).setapellido2(n);
            Scanner teclado04 = new Scanner(System.in);
            System.out.print("Dime el DNI del titular: ");
            n=teclado04.next();
            cuentas.get(1).setDNI(n);
            Scanner teclado05 = new Scanner(System.in);
            System.out.print("Dime el saldo que tiene la cuenta: ");
            s=teclado05.nextFloat();
            cuentas.get(1).setsaldo(s);
        }
        if(i==1){
            System.out.println();
            System.out.println("Introducción de los datos de la cuenta Nº3: ");
            Scanner teclado06 = new Scanner(System.in);
            System.out.print("Dime el nombre del titular: ");
            n=teclado06.next();
            cuentas.get(2).setnombre(n);
            Scanner teclado07 = new Scanner(System.in);
            System.out.print("Dime el primer apellido del titular: ");
            n=teclado07.next();
            cuentas.get(2).setapellido1(n);
            Scanner teclado08 = new Scanner(System.in);
            System.out.print("Dime el segundo apellido del titular: ");
            n=teclado08.next();
            cuentas.get(2).setapellido2(n);
            Scanner teclado09 = new Scanner(System.in);
            System.out.print("Dime el DNI del titular: ");
            n=teclado09.next();
            cuentas.get(2).setDNI(n);
            Scanner teclado10 = new Scanner(System.in);
            System.out.print("Dime el saldo que tiene la cuenta: ");
            s=teclado10.nextFloat();
            cuentas.get(2).setsaldo(s);
        }
    }    
    /*Llamamos a la clase menú para movernos entre las diferentes opciones*/
    System.out.println();
    Menu m = new Menu();
    int op1=0;
    int op2=0;
    while (op1!=4){
        op1=m.menuswitch1(op1, op2, cuentas);
    if (op1 == 4){
            System.out.println("Saliendo del programa...");
        }
    }
    }
}
