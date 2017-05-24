/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84_2;

/**
 * Clase cuenta. Encontramos diferentes métodos los cuales nos permitirá 
 * realizar diferentes operaciones como el ingreso, el reintegro o la 
 * transferencia.
 * @author pablo
 */
public class cuenta {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;
    private float saldo;
    private float tipo_interes;
    private int num_cuenta;
    
    /*Constructor por defecto*/
    public cuenta(){
        
    }
    /*Constructor con parámetros*/
    public cuenta(String nombre, String apellido1, String apellido2, String DNI,
            float saldo, float tipo_interes, int num_cuenta){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.DNI=DNI;
        this.saldo=saldo;
        this.tipo_interes=tipo_interes;
        this.num_cuenta=num_cuenta;
    }
    /*Constructor copia*/
    public cuenta(cuenta c1) {
        this.nombre=c1.nombre;
        this.apellido1=c1.apellido1;
        this.apellido2=c1.apellido2;
        this.DNI=c1.DNI;
    }
    /**Método set para guardar el valor que le pasamos de saldo
     * @param saldo Variable con el valor saldo
     */
    public void setsaldo(float saldo){
        this.saldo=saldo;
    }

    /**Método set para guardar el valor que le pasamos de tipo_interes
     * @param tipo_interes Variable con el valor tipo_interes
     */
    public void setinteres(float tipo_interes){
        this.tipo_interes=tipo_interes;
    }
    /**Método set para guardar el valor que le pasamos de num_cuenta
     * @param num_cuenta Variable con el valor num_cuenta
     */
    public void setncuenta(int num_cuenta){
        this.num_cuenta=num_cuenta;
    }    
    /**Método get de la variable nombre
     * @return Devuelve el valor de nombre
     */
    public String getnombre(){
        return nombre;
    }
    /**Método get de la variable apellido
     * @return Devuelve el valor de apellido1
     */
    public String getapellido1(){
        return apellido1;
    }
    /**Método get de la variable apellido2
     * @return Devuelve el valor de apellido2
     */
    public String getapellido2(){
        return apellido2;
    }
    /**Método get de la variable DNI
     * @return Devuelve el valor de DNI
     */
    public String getDNI(){
        return DNI;
    }
     /**Método get de la variable saldo
     * @return Devuelve el valor de saldo
     */
    public float getsaldo(){
        return saldo;
    }
     /**Método get de la variable tipo_interes
     * @return Devuelve el valor de tipo_interes
     */
    public float getinteres(){
        return tipo_interes;
    }
     /**Método get de la variable num_cuenta
     * @return Devuelve el valor de num_cuenta
     */
    public int getncuenta(){
        return num_cuenta;
    }
    
    /**Método para realizar un ingreso en las cuentas
     * @param ingreso Variable con la cantidad que se desea ingresar en la cuenta.
     */
    public void ingreso(float ingreso){
        saldo=saldo+ingreso;
}
    /**Método para realizar un reintegro en las cuentas
     * @param reintegro Variable con la cantidad que se desea sacar de la cuenta
     */
    public void reintegro(float reintegro) {
        saldo=saldo-reintegro;
}
    /**Métodos para realizar una trensferencia negativa en las cuentas
     * @param reintegro Variable con la cantidad que se desea sacar de la cuenta
     */
    public void transferencianeg(float reintegro) {
        saldo=saldo-reintegro;
}
    /**Métodos para realizar una trensferencia positiva en las cuentas
     * @param ingreso Variable con la cantidad que se desea ingresar en la cuenta
     */
    public void transferenciapos(float ingreso) {
        saldo=saldo+ingreso;
}
}
