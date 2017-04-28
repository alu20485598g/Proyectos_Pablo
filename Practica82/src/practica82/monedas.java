/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica82;

import java.util.Scanner;

/**
 * Clase monedas. Encontramos los métodos PedirCantidad, Desglosar y GetDesglose
 * los cuales nos permitiran desglosar la cantidad introducida por el usuario.
 * @author pablo
 */
public class monedas {
    private int cantidad;
    private int[] cocientes = new int[9];
    private int[] restos = new int[9];
    private int[] valores = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
    
    /**Método que pide al usuario la cantidad que desea desglosar.
     * 
     */
    public void PedirCantidad(){
        System.out.print("Dime que cantidad quieres desglosar: ");
        Scanner teclado = new Scanner(System.in);
        cantidad=teclado.nextInt();
    }
    /**Método que desglosa la cantidad total introducida por el usuario.
     * 
     */
    public void Desglosar(){
        cocientes[0]=cantidad/valores[0];
        restos[0]=cantidad-valores[0]*cocientes[0];
        for(int i=1;i<9;i++){
            cocientes[i]=restos[i-1]/valores[i];
            restos[i]=restos[i-1]-valores[i]*cocientes[i];
        }
    }
    /**Método que muestra por pantalla la cantidad desglosada.
     * 
     */
    public void GetDesglose(){
        System.out.println("---------------------");
        System.out.println("Cantidad desglosada:");
        System.out.println("---------------------");
        for(int i=0;i<7;i++){
            System.out.println("Billetes de "+ valores[i] +"€: "+cocientes[i]);
        }
        System.out.println("Monedas de "+ valores[7] +"€: "+cocientes[7]);
        System.out.println("Monedas de "+ valores[8] +"€: "+cocientes[8]);
    }  

    
}
