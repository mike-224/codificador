import java.io.IOException;
import java.util.Scanner;

public class Codi {
    public static void main(String[] args) throws IOException {
        //Declaramos scanner y vars
        Scanner sc = new Scanner(System.in);
        String mensaje;
        int llave;
        char opcion;
        //Pedir el mensaje a cifrar
        do {
            System.out.print("Introduce el mensaje para cifrarlo: ");
            mensaje = sc.nextLine();
        } while (mensaje.isEmpty()); //Si esta vacio lo pido otra vez
        //Pedimos un nº para que sea la llave de encriptacion
        do {
            System.out.print("Introduce tu llave: ");
            llave = sc.nextInt();
        } while (llave < 1 ); //La llave tiene que ser mayor que 0
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
