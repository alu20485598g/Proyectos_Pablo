/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica82;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class monedas {
    private int cantidad;
    private int[] cocientes = new int[9];
    private int[] restos = new int[9];
    private int[] valores = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
    
    
    public void PedirCantidad(){
        System.out.print("Dime que cantidad quieres desglosar: ");
        Scanner teclado = new Scanner(System.in);
        cantidad=teclado.nextInt();
    }
    public void Desglosar(){
        cocientes[0]=cantidad/valores[0];
        restos[0]=cantidad-valores[0]*cocientes[0];
        for(int i=1;i<9;i++){
            cocientes[i]=restos[i-1]/valores[i];
            restos[i]=restos[i-1]-valores[i]*cocientes[i];
        }
    }
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
