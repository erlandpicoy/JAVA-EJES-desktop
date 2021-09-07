/*Desarrolla un programa java que pida al usuario que introduzca un número entero que
este entre 1 y 9. Y dibuja por pantalla la tabla de multiplicar de dicho número.
No es necesario que el programa comprueba si el número introducido está dentro del rango admitido.*/

public class EjerciciosN5 {

    public static void main(String[]args){
        mostrarTabla(5);
    }

    public static void mostrarTabla(int valor){
        for (int i=1;i<=10;i++){
            System.out.println(valor+"x"+i+"="+valor*i);
        }
    }
}

