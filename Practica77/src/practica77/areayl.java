/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica77;

/**
 *
 * @author pablo
 */
public class areayl {
     private float resul;   

public float getlongitud(float r){
    resul=(float) (r*2*Math.PI);
    return resul;
}

public float getarea(float r){
    resul=(float) (Math.pow(r, 2)*Math.PI);
    return resul;
}
}
