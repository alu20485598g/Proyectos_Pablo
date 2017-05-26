/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica90;

import java.util.Scanner;

/** Clase nif. Encontramos diferentes métodos los cuales nos permitirá 
 * realizar diferentes operaciones como la petición de DNI al usuario o la 
 * impresión por pantalla de la letra que corresponde al DNI introducido, 
 * además de los getters y setters.
 *
 * @author pablo
 */
public class nif {
    private int dni;
    private int resto;
    private char letra;
    
    public nif(){   //Constructor por defecto
    
}

    /** Método get de la variable dni
     * @return Devuelve el valor de dni
     */
    public int getdni(){
        return dni;
    }
        
    /**Método set de la variable dni
     * @param dni Variable con el valor de dni
     */
    public void setdni(int dni){
        this.dni=dni;
    }
    
    /** Método get de la variable letra
     * @return Devuelve el valor de letra
     * @deprecated Sin uso.
     */
    public char getletra(){
        return letra;
    }
        
    /**Método set de la variable letra
     * @param letra Variable con el valor de letra
     * @deprecated Sin uso.
     */
    public void setletra(char letra){
        this.letra=letra;
    }
    
    /** Método que nos permite preguntarle al usuario el DNI
     *
     * @param n Variable donde se guardan los valores del objeto n
     */
    public void pedirdni(nif n){
        Scanner teclado01 = new Scanner(System.in);
        System.out.println("Dime tu número del NIF para averiguar la letra: ");
        dni=teclado01.nextInt();
        n.setdni(dni);
    }
    
    /** Método que devuelve la letra según el DNI introducido
     *
     */
    public void buscaletra(){
    resto=dni%23;
    System.out.println("La letra que corresponde a tu NIF es:");
    /*Realizamos las operaciones*/
    switch(resto){
        case 0: System.out.println("T");  
        break;
        case 1: System.out.println("R");  
        break;
        case 2: System.out.println("W");  
        break;
        case 3: System.out.println("A");  
        break;
        case 4: System.out.println("G");  
        break;
        case 5: System.out.println("M");  
        break;
        case 6: System.out.println("Y");  
        break;
        case 7: System.out.println("F");  
        break;
        case 8: System.out.println("P");  
        break;
        case 9: System.out.println("D");  
        break;
        case 10: System.out.println("X");  
        break;
        case 11: System.out.println("B");  
        break;
        case 12: System.out.println("N");  
        break;
        case 13: System.out.println("J");  
        break;
        case 14: System.out.println("Z");  
        break;
        case 15: System.out.println("S");  
        break;
        case 16: System.out.println("Q");  
        break;
        case 17: System.out.println("V");  
        break;
        case 18: System.out.println("H");  
        break;
        case 19: System.out.println("L");  
        break;
        case 20: System.out.println("C");  
        break;
        case 21: System.out.println("K");  
        break;
        case 22: System.out.println("E");  
        break;
        default: System.out.println("El numero introducido no es correcto.");  
        break;
    }
    }
    
    
}
