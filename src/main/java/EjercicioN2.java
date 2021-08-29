//Ejercitacion N1 crear una funcion que nos devuelva la factorial de un numero entero.


public class EjercicioN2 {

    public static void main(String []args){
        System.out.println(esPrimo(11));
    }

    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i=(int)Math.sqrt(numero);i>1;i--){
            if (numero%i==0){
                return false;
            }
        }

        return true;

    }
}
