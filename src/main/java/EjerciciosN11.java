import java.util.*;
public class EjerciciosN11 {
    public static void main (String []args){
        Scanner teclado=new Scanner(System.in);
        String nombre_1 = "", nombre_2= "" ;
        System.out.print("Ingrese el primer nombre: ");
        nombre_1 = teclado.nextLine();
        System.out.print("Ingrese el segundo nombre: ");
        nombre_2 = teclado.nextLine();

        if (nombre_1.equalsIgnoreCase(nombre_2)){
            System.out.println("Los nombres son iguales");
        }else{
            System.out.println("Distintos");
        }
    }
}
