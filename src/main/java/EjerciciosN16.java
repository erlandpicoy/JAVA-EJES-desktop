public class EjerciciosN16 {
    public static void main (String[]args){
        int filas = 3;
        int columnas = 3;
        int contador=0;
        int matriz[][]=new int[filas][columnas];

        for(int j=0;j<filas; j++){
            for (int i=0;i<columnas; i++){
                contador++;
                matriz[j][i]=contador;
            }
        }

        for(int j=0;j<filas; j++){
            for (int i=0;i<columnas; i++){
                System.out.print(matriz[j][i]+" - ");
            }
            System.out.println("");
        }


    }
}
