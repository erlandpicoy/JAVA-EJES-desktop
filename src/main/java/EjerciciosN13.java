import java.util.*;
public class EjerciciosN13 {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena_original = "";
        String cadena_subtraida = "";
        int num1 = 0, num2 = 0;

        System.out.print("INGRESE CADENA: ");
        cadena_original = teclado.nextLine();

        System.out.println("Longitud de cadena es de "+ cadena_original.length());

        System.out.println("Eliga el corte de la cadena");
        num1= teclado.nextInt();
        num2= teclado.nextInt();
        System.out.println(cadena_original.substring(num1,num2));



    }
}
