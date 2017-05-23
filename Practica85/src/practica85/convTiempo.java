/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85;

import java.util.Scanner;

/**
 * Clase convTiempo. Encontramos diferentes métodos los cuales nos permitirá 
 * pedir los segundos al usuario y convertir los segundos en otras unidades.
 * @author pablo
 */
public class convTiempo {
    private int segundos;
    private int[] tiempo = new int[4];
    private int[] restos = new int[4];
    private int[] valores = new int[]{604800, 86400, 3600, 60};
    /**Método que pide al usuario los segundos a converir.
     * 
     */
    public void PedirSegundos(){
        System.out.print("Dime cuantos segundos quieres convertir: ");
        Scanner teclado = new Scanner(System.in);
        segundos=teclado.nextInt();
    }
    /**Método que convierte los segundos en diferentes unidades de tiempo.
     * 
     */
    public void Convertir(){
        tiempo[0]=segundos/valores[0];
        restos[0]=segundos-valores[0]*tiempo[0];
        for(int i=1;i<4;i++){
            tiempo[i]=restos[i-1]/valores[i];
            restos[i]=restos[i-1]-valores[i]*tiempo[i];
        }
    }
    /**Método que devuelve los segundos introducidos por el usuario ya 
     * convertidos.
     */
    public void GetConvertir(){
        System.out.println("--------------------------------------");
        System.out.println("Los segundos introducidos equivalen a:");
        System.out.println("--------------------------------------");
        System.out.println("Semanas: "+ tiempo[0]);
        System.out.println("Días: "+ tiempo[1]);
        System.out.println("Horas: "+ tiempo[2]);
        System.out.println("Minutos: "+ tiempo[3]);
        System.out.println("Segundos: "+ restos[3]);
        }
}
