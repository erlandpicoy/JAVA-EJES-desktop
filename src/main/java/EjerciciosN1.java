//Ejercitacion N1 crear una funcion que nos devuelva la factorial de un numero entero.

public class EjerciciosN1 {

    public static void main(String []args){
        System.out.println(factorial(30));
    }

    public static int factorial(int numero){
        if (numero <0){
            System.out.println("Error 404");
            return -1;
        }
        if (numero==0 && numero==1){
            return 1;
        }
        int resultado = numero;

        for(int i=(numero-1);i>1;i--){
            resultado= resultado * i;
    }
        return resultado;
    }
}
