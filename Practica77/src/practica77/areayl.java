/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica77;

/**
 * Clase areayl. Encontramos todos los métodos para realizar las 
 * operaciones para calcular el perímetro y el área.
 * @author pablo
 */
public class areayl {
/** Método que devuelve el perímetro de la circunferencia
* @param resul Variable donde encontramos el el valor del perímetro.
* @param r Variable que coje de la clase principal y donde encontramos el radio
* pasado por el usuario.
* @return Devolverá un número de tipo float con el valor del perímetro.*/
  private float resul;
  
public float getlongitud(float r){
    resul=(float) (r*2*Math.PI);
    return resul;
}
/** Método que devuelve el área de la circunferencia
* @param resul Variable donde encontramos el el valor del área.
* @param r Variable que coje de la clase principal y donde encontramos el radio
* pasado por el usuario.
* @return Devolverá un número de tipo float con el valor del área.*/
public float getarea(float r){
    resul=(float) (Math.pow(r, 2)*Math.PI);
    return resul;
}
}
