import java.io.IOException;
import java.util.Scanner;

public class Codi {
    public static void main(String[] args) throws IOException {
        //Declaramos scanner y vars
        Scanner sc = new Scanner(System.in);
        String mensaje = "La Operación Regenbogen ha sido todo un éxito, desplazarse mañana dia 25 al puerto de Bremen";
        int llave = 5;
        char opcion;
        System.out.println("Texto cifrado: " + cifradoCesar(mensaje, llave)); //Mostramos por consola el mensaje cifrado
    }

    public static String cifradoCesar(String mensaje, int llave) {
        StringBuilder cifrado = new StringBuilder();
        llave = llave % 26;
        for (int i = 0; i < mensaje.length(); i++) {
            if (mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z') {
                if ((mensaje.charAt(i) + llave) > 'z') {
                    cifrado.append((char) (mensaje.charAt(i) + llave - 26));
                } else {
                    cifrado.append((char) (mensaje.charAt(i) + llave));
                }
            } else if (mensaje.charAt(i) >= 'A' && mensaje.charAt(i) <= 'Z') {
                if ((mensaje.charAt(i) + llave) > 'Z') {
                    cifrado.append((char) (mensaje.charAt(i) + llave - 26));
                } else {
                    cifrado.append((char) (mensaje.charAt(i) + llave));
                }
            }
        }
        return cifrado.toString();
    }
    }
