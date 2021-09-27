
import java.util.*;
public class EjerciciosN9 {
    public static void main (String []args){
        Scanner teclado=new Scanner(System.in);

        int numero_1 = 0, numero_2 = 0, parametro = 0;
        double resultado = 0;
        System.out.println("Ingrese 2 numeros cualquiera:");
        numero_1 = teclado.nextInt();
        numero_2 = teclado.nextInt();

        System.out.println("1 - SUMAR");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULTIPLICAR ");
        System.out.println("4 - DIVIDIR");

        System.out.print("ingrese una opcion con los numeros : ");
        parametro = teclado.nextInt();
        switch (parametro){
            case 1:
                resultado = numero_1 + numero_2;
                System.out.println("Seleccionaste SUMAR donde " + numero_1 +" + "+ numero_2 + " = " + resultado);
                break;
            case 2:
                resultado = numero_1 - numero_2;
                System.out.println("Seleccionaste RESTAR donde " + numero_1 +" - "+ numero_2 + " = " + resultado);
                break;
            case 3:
                resultado = numero_1 * numero_2;
                System.out.println("Seleccionaste MULTIPLICAR donde " + numero_1 +" * "+ numero_2 + " = " + resultado);
                break;
            case 4:
                resultado = numero_1 / numero_2;
                System.out.println("Seleccionaste DIVIDIR donde " + numero_1 +" / "+ numero_2 + " = " + resultado);
                break;

            default:
                System.out.println("Numero de seleccion incorrecto");
        }
    }
}
