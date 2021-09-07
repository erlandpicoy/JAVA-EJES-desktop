/*Desarrolla un programa que haga lo siguiente:
Pida al usuario que introduzca un número entre 1 y 1.000.
Pinte por pantalla todos los divisores exactos del número introducido.
Por ejemplo, si el número introducido fuera 170, el resultado por pantalla sería algo similar a:*/

public class EjerciciosN7 {
    public static void main (String []args){
        mostrarDivisores(170);
    }

    public static void mostrarDivisores(int valor){
        for (int i=1; i<valor;i++){
            //System.out.println(valor+" - "+ i);
            if(valor%i==0){
                System.out.println(valor+" es divisible por "+i);
            }
        }
    }
}
