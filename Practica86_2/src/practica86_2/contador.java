/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica86_2;

/**
 ** Clase contador. Encontramos diferentes métodos los cuales nos permitirá 
 * movernos entre los diferentes menús para escoger diferentes opciones.
 * @author pablo
 */
public class contador {
    private int contador;
    
    public contador(){ //Constructor por defecto
        
    }

    public contador(int contador){ //Constructor con parámetros
        this.contador=contador;
    }

    public contador (contador c){ //Constructor copia.
        contador=c.contador;
    }
    /**Método get de la variable contador
     * @return Devuelve el valor de contador
     */
    public int getcontador(){
        return contador;
    }
    /**Método set para guardar el valor que le pasamos de contador
     * @param contador Variable con el valor del contador
     */
    public void setcontador(int contador){
        this.contador=contador;
    }
    
    /**Método para realizar un decremento en el contador
     *
     */
    public void decrementar(){
        contador--;    
    }
    /**Método para realizar un incremento en el contador
     *
     */
    public void incrementar(){
        contador++;
    }
    
    

}
