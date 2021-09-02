//ingresar dado un tiempo en minutos por teclado, calcular los días, horas y minutos que le corresponden.
import java.util.*;
public class EjerciciosN3 {
    public static void main (String []args){
        calculoFecha(ingreseTeclado());
    }

    public static int ingreseTeclado(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un valor:");
        int teclado=sc.nextInt();
        return teclado;
    }

    public static void calculoFecha(int valor){
        int dias,horas, minutos;
        int minutos_dia = 1440;
        int resto_horas,resto_minutos;

        dias=valor/minutos_dia;
        resto_horas=valor-(minutos_dia*(valor/minutos_dia));
        horas=resto_horas / 60;
        resto_minutos= resto_horas-(60*(60/resto_horas));
        minutos = resto_minutos - (60*(resto_minutos/60));

        System.out.println("Resultado:" + dias + " dias");
        System.out.println("Resultado " + horas + " horas");
        System.out.println("Resultado " + minutos + " minutos");

    }
}
