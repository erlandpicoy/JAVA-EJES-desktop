//fibonacci
public class ejerciciosN10 {

    public static void main (String []args){

        int a = 0, b = 1, c = 0, i = 1;

        for (i = 0; i < 10 ; i++){

            System.out.print( a + ",");
            c = a + b;
            a = b;
            b = c;

        }

        a = 0;
        b = 1;
        c = 0;
        i = 1;
        System.out.println("");
        while (i <= 10){
            System.out.print( a + ",");
            c = a + b;
            a = b;
            b = c;
            i=i + 1;
        }

        a = 0;
        b = 1;
        c = 0;
        i = 0;
        System.out.println("");
        do{
            System.out.print( a + ",");
            c = a + b;
            a = b;
            b = c;
            i=i + 1;

        }while (i<10);
    }


}
