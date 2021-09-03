/*Escribe un programa Java que pida al usuario que introduzca una password numérica, de valor comprendido
entre 0 y 999 (no es necesario comprobar que el valor introducido por el usuario está en dicho rango, se supone
que el usuario lo hace bien).
El programa tiene almacenado el valor de la password correcta en una variable llamada key (hardcodeada).
El objetivo del usuario es introducir la password correcta, en cuyo caso el programa debe imprimir
el mensaje: “acceso autorizado”.
El usuario tiene un máximo de 3 intentos para introducir la password correcta. Si el usuario falla en sus
tres intentos, el programa presentará el mensaje de: “Ha excedido el número de intentos permitidos” y acaba el programa.
El máximo número de intentos permitidos lo guardamos en una variable tipo int, con su valor hardcodeado (=3).
Puedes usar las variables adicionales que estimes oportunas.*/


import java.util.Scanner;

public class EjerciciosN6 {
    public static void main(String []args){

        ingresoKey(creacionKey());
    }

    public static int creacionKey(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un valor de 0 a 999 como KEY: ");
        int key = sc.nextInt();
        return key;
    }

    public static boolean ingresoKey(int clave){
        Scanner sc=new Scanner(System.in);
        int i=1;
        do {
            System.out.println("Ingrese la clave:");
            int key = sc.nextInt();
            if (clave == key){
                System.out.println("ACCESO CONCEDIDO");
                return true;
            }
            System.out.println("ERROR");
            i++;
        }while (i<=3);
        System.out.println("Ha excedido el número de intentos permitidos");

        return false;
    }

}
