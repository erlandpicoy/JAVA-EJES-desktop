
import java.util.Scanner;

public class EjerciciosN8 {

    public static void main (String []args){

        Scanner teclado=new Scanner(System.in);
        String nombre="";
        int clave = 0, antiguedad = 0;

        System.out.println("Bienvenido al sistema vacacional");
        System.out.println("");
        System.out.print("Ingrese el nombre del empleado:");
        nombre = teclado.nextLine();
        System.out.print("Ingrese la angiguedad del "+ nombre+":");
        antiguedad = teclado.nextInt();
        System.out.print("Ingrese la clave del departamento:");
        clave = teclado.nextInt();
        System.out.println("");

        if (clave == 1) {

            if (antiguedad == 1){
                System.out.println(nombre+ " tiene derecho a 7 dias de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <=6){
                System.out.println(nombre+ " tiene derecho a 15 dias de vacaciones");
            }else if (antiguedad >= 7){
                System.out.println(nombre+ " tiene derecho a 21 dias de vacaciones");
            }else{
                System.out.println(nombre + " NO tiene derechos a vacaciones");
            }

        } else if (clave == 2){

            if (antiguedad == 1){
                System.out.println(nombre+ " tiene derecho a 7 dias de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <=6){
                System.out.println(nombre+ " tiene derecho a 15 dias de vacaciones");
            }else if (antiguedad >= 7){
                System.out.println(nombre+ " tiene derecho a 21 dias de vacaciones");
            }else{
                System.out.println(nombre + " NO tiene derechos a vacaciones");
            }

        } else if (clave == 3) {

            if (antiguedad == 1){
                System.out.println(nombre+ " tiene derecho a 7 dias de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <=6){
                System.out.println(nombre+ " tiene derecho a 15 dias de vacaciones");
            }else if (antiguedad >= 7){
                System.out.println(nombre+ " tiene derecho a 21 dias de vacaciones");
            }else{
                System.out.println(nombre + " NO tiene derechos a vacaciones");
            }

        }else{
            System.out.println("Error, la clave del departamento no existe.");
        }
    }
}
