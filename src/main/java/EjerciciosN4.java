//Dado un tiempo en segundos e ingresado por teclado, calcular los segundos restantes para convertirse exactamente en minutos.

public class EjerciciosN4 {

    public static void main (String []args){
        segundos(150);
    }

    public static void segundos(int valor){
        int minutos,resto_segundos,segudos_faltantes;

        minutos = valor / 60;
        resto_segundos = valor - (60*(valor/60));
        segudos_faltantes=60 - resto_segundos;

        System.out.println("ingresado: "+ valor);
        System.out.println("minutos: "+ minutos);
        System.out.println("segundos faltantes: "+ segudos_faltantes);
    }
}

// ingresado : 150
// minutos : 2 min
// resultado : 30

