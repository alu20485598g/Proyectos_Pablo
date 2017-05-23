/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84_2;

import java.util.Scanner;

/**
 ** Clase Menu. Encontramos diferentes métodos los cuales nos permitirá 
 * movernos entre los diferentes menús para escoger diferentes opciones.
 * @author pablo
 */
public class Menu {
        
    /** Método que nos permite escoger con que cuenta queremos operar.
     * 
     * @return Nos devuelve la opción que hemos elegido.
     */
    public int menucuentas(){
    System.out.println();
    Scanner teclado01 = new Scanner(System.in);
    System.out.println("Dime con que cuenta quieres operar:");
    System.out.println("1.Cuenta Nº1");
    System.out.println("2.Cuenta Nº2");
    System.out.println("3.Cuenta Nº3");
    System.out.println("4.Salir");
    System.out.println();
    return teclado01.nextInt();
    }
    
    /** Método que nos permite escoger que operación queremos realizar.
     *
     * @return Nos devuelve la opción que hemos elegido.
     */
    public int menuoperacion(){
    System.out.println();
    Scanner teclado02 = new Scanner(System.in);
    System.out.println("Dime que operación quieres realizar:");
    System.out.println("1.Ingresar");
    System.out.println("2.Extraer");
    System.out.println("3.Realizar una transferencia.");
    System.out.println("4.Mostrar datos.");
    System.out.println("5.Volver al menú anterior para elegir cuenta.");
    System.out.println();
    return teclado02.nextInt();
    }
    
    /** Método que nos permite ir a un menú u otro dependiendo de la cuenta que 
     * hemos elegido.
     *
     * @param op1 Variable que guarda la opción escogida en el menucuentas()
     * @param op2 Variable que guarda la opción escogida en el menuoperacion()
     * @param c1 Variable donde se guardan los datos del objeto c1, de la primera cuenta
     * @param c2 Variable donde se guardan los datos del objeto c2, de la segunda cuenta
     * @param c3 Variable donde se guardan los datos del objeto c3, de la tercera cuenta
     * @return Nos devuelve la opción que hemos elegido.
     */
    public int menuswitch1(int op1, int op2, cuenta c1, cuenta c2, cuenta c3){
    op1=menucuentas();
    switch(op1){
        case 1:
            menuswitch2(op1, op2, c1, c2, c3);
        break;
        case 2:
            menuswitch2(op1, op2, c1, c2, c3);
        break;
        case 3:
            menuswitch2(op1, op2, c1, c2, c3);
        break;
        case 4:
        break;
        default:
            System.out.println("No has escogido una opción correcta.");
    }
    return op1;
    }
    
    /** Método que nos permite realizar una operación u otra dependiendo del 
     * valor op2
     *
     * @param op1 Variable que guarda la opción escogida en el menucuentas()
     * @param op2 Variable que guarda la opción escogida en el menuoperacion()
     * @param c1 Variable donde se guardan los datos del objeto c1, de la primera cuenta
     * @param c2 Variable donde se guardan los datos del objeto c2, de la segunda cuenta
     * @param c3 Variable donde se guardan los datos del objeto c3, de la tercera cuenta
     */
    public void menuswitch2(int op1, int op2, cuenta c1, cuenta c2, cuenta c3){
        float ingreso;
        float reintegro;
        while (op2!=5){
            op2=menuoperacion();
            switch(op2){
                case 1:
                    ingreso=cantingreso();
                    if (op1==1){
                        c1.ingreso(ingreso);
                        System.out.println("Ingreso realizado. Tu saldo actual "
                                + "es de "+ c1.getsaldo()+" €.");}
                     if (op1==2){
                        c2.ingreso(ingreso);
                        System.out.println("Ingreso realizado. Tu saldo actual "
                                + "es de "+ c2.getsaldo()+" €.");}
                      if (op1==3){
                        c3.ingreso(ingreso);
                        System.out.println("Ingreso realizado. Tu saldo actual "
                                + "es de "+ c3.getsaldo()+" €.");}
                break;
                case 2:
                    reintegro=cantreintegro();
                    if (op1==1){
                      c1.reintegro(reintegro);
                      System.out.println("Reintegro realizado. Tu saldo actual "
                                + "es de "+ c1.getsaldo());}
                    if (op1==2){
                      c2.reintegro(reintegro);
                      System.out.println("Reintegro realizado. Tu saldo actual "
                                + "es de "+ c2.getsaldo());}
                    if (op1==3){
                      c3.reintegro(reintegro);
                      System.out.println("Reintegro realizado. Tu saldo actual "
                                + "es de "+ c3.getsaldo());}
                break;
                case 3:
                    transferencia(op1, c1, c2, c3);
                break;
                case 4:
                    System.out.println("Las 3 cuentas pertenecen al mismo "
                            + "titular, sus datos son los siguientes:");
                    System.out.println("Nombre completo: "+ c1.getnombre() +" "
                            + c1.getapellido1() +" "+ c1.getapellido2());
                    System.out.println("DNI: " + c1.getDNI());
                    if (op1==1){
                      System.out.println("Tipo de interés: "+ c1.getinteres());
                      System.out.println("Saldo: "+ c1.getsaldo());
                    }
                    if (op1==2){
                      System.out.println("Tipo de interés: "+ c2.getinteres());
                      System.out.println("Saldo: "+ c2.getsaldo());
                    }
                    if (op1==3){
                      System.out.println("Tipo de interés: "+ c3.getinteres());
                      System.out.println("Saldo: "+ c3.getsaldo());
                    }
                break;
                case 5:
                break;
                default:
                    System.out.println("No has escogido una opción correcta.");                    
            }
        if (op2 == 5){
            System.out.println("Volviendo al menú para elegir cuenta...");
        }
    }
    }

    /** Método para preguntarle el usuario la cantidad que desea ingresar.
     *
     * @return Nos devuelve la cantidad a ingresar
     */
    public float cantingreso(){
        Scanner teclado01 = new Scanner(System.in);
        System.out.print("Cantidad a ingresar: ");
        return teclado01.nextFloat();
    }

    /** Método para preguntarle el usuario la cantidad que desea retirar.
     *
     * @return Nos devuelve la cantidad a retirar
     */
    public float cantreintegro(){
        Scanner teclado02 = new Scanner(System.in);
        System.out.print("Cantidad a retirar: ");
        return teclado02.nextFloat();
    }

    /** Método para realizar las diferentes transferencia entre cuentas
     *
     * @param op1 Variable que guarda la opción escogida en el menucuentas()
     * @param c1 Variable donde se guardan los datos del objeto c1, de la primera cuenta
     * @param c2 Variable donde se guardan los datos del objeto c2, de la segunda cuenta
     * @param c3 Variable donde se guardan los datos del objeto c3, de la tercera cuenta
     */
    public void transferencia(int op1, cuenta c1, cuenta c2, cuenta c3){
        int cuentadestino;
        float cantidad;
        switch (op1){
            case 1:
                System.out.println("Ahora se encuentra en la cuenta Nº1.");
                Scanner teclado03 = new Scanner(System.in);
                System.out.println("¿A que cuenta quieres realizar una "
                        + "transferencia?");
                System.out.println("1. A la cuenta Nº2");
                System.out.println("2. A la cuenta Nº3");
                cuentadestino=teclado03.nextInt();
                System.out.println();
                Scanner teclado04 = new Scanner(System.in);
                System.out.println("¿Cuánto quieres transferir?");
                cantidad=teclado04.nextFloat();
                c1.transferencianeg(cantidad);
                if (cuentadestino==1){
                    c2.transferenciapos(cantidad);
                }
                if (cuentadestino==2){
                    c3.transferenciapos(cantidad);
                }
                System.out.println("Operacion realizada con éxito. Su saldo "
                        + "actual es de "+ c1.getsaldo()+"€.");
            break;
            case 2:
                System.out.println("Ahora se encuentra en la cuenta Nº2.");
                Scanner teclado05 = new Scanner(System.in);
                System.out.println("¿A que cuenta quieres realizar una "
                        + "transferencia?");
                System.out.println("1. A la cuenta Nº1");
                System.out.println("2. A la cuenta Nº3");
                cuentadestino=teclado05.nextInt();
                System.out.println();
                Scanner teclado06 = new Scanner(System.in);
                System.out.println("¿Cuánto quieres transferir?");
                cantidad=teclado06.nextFloat();
                c2.transferencianeg(cantidad);
                if (cuentadestino==1){
                    c1.transferenciapos(cantidad);
                }
                if (cuentadestino==2){
                    c3.transferenciapos(cantidad);
                }
                System.out.println("Operacion realizada con éxito. Su saldo "
                        + "actual es de "+ c2.getsaldo()+"€.");
            break;
            case 3:
                System.out.println("Ahora se encuentra en la cuenta Nº3.");
                Scanner teclado07 = new Scanner(System.in);
                System.out.println("¿A que cuenta quieres realizar una "
                        + "transferencia?");
                System.out.println("1. A la cuenta Nº1");
                System.out.println("2. A la cuenta Nº2");
                cuentadestino=teclado07.nextInt();
                System.out.println();
                Scanner teclado08 = new Scanner(System.in);
                System.out.println("¿Cuánto quieres transferir?");
                cantidad=teclado08.nextFloat();
                c3.transferencianeg(cantidad);
                if (cuentadestino==1){
                    c1.transferenciapos(cantidad);
                }
                if (cuentadestino==2){
                    c2.transferenciapos(cantidad);
                }
                System.out.println("Operacion realizada con éxito. Su saldo "
                        + "actual es de "+ c3.getsaldo()+"€.");
            break;
        }
    }
}