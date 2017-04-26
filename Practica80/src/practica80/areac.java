/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica80;

/**
 * Clase areac. Encontramos el método getareal y getareat el cual nos permitirá 
 * calcular el área del círculo.
 * @author pablo
 */
public class areac {
    private float resul;
     /** Método que devuelve el perímetro de la circunferencia
* @param l Variable que coje de la clase principal y donde encontramos el lado 
* del círculo pasado por el usuario.
* @return Devolverá un número de tipo float con el valor del área(resul).*/
public float getareal(float l){
    resul=l*l*4;
    return resul;
}
/** Método que devuelve el perímetro de la circunferencia
* @param l Variable que coje de la clase principal y donde encontramos el lado 
* del círculo pasado por el usuario.
* @return Devolverá un número de tipo float con el valor del área(resul).*/
public float getareat(float l){
    resul=l*l*6;
    return resul;
} 
}
