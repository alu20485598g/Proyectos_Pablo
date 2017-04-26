/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica81;

/**
 * Clase ayve. Encontramos el método getarea y getvolumen el cual nos permitirá 
 * calcular el área y el volumen de la esfera.
 * @author pablo
 */
public class ayve {
    private float resul;
    /** Método que devuelve el área lateral de la circunferencia
* @param r Variable que coje de la clase principal y donde encontramos el radio 
* de la esfera pasado por el usuario.
* @return Devolverá un número de tipo float con el valor del área(resul).*/
public float getarea(float r){
    resul=(float) (4*Math.PI*Math.pow(r,2));
    return resul;
}
    /** Método que devuelve el área lateral de la circunferencia
* @param r Variable que coje de la clase principal y donde encontramos el radio 
* de la esfera pasado por el usuario.
* @return Devolverá un número de tipo float con el valor del volumen(resul).*/
public float getvolumen(float r){
    resul=(float) ((4*Math.PI*Math.pow(r,3))/3);
    return resul;
} 
}
