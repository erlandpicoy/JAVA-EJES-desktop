import com.sun.javafx.image.BytePixelSetter;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
public class EjerciciosN12 {
    public static void main (String []args){
        Scanner teclado=new Scanner(System.in);
        String usuario = "ipicoy", in_user= "";
        int contraseña = 64875515, in_pass = 0;

        System.out.print("USUARIO: ");
        in_user= teclado.nextLine();
        if (in_user.equalsIgnoreCase(usuario)){
           System.out.print("CONTRASEÑA: ");
           in_pass = teclado.nextInt();
           if (in_pass == contraseña){
                System.out.println("ACCESO CONCEDIDO");
           }else{
                System.out.println("CONTRASEÑA INCORRECTA");
           }

        }else {
            System.out.println("USUARIO INCORRECTO");
        }



    }
}
