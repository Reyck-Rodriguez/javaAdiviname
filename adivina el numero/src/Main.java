import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos intentos deseas dar?");
        int numeroIntentos = scanner.nextInt();
        System.out.println("Adivina el número (entre 0 y 100) tienes: " + numeroIntentos);

        for (int i = 0; i < numeroIntentos; i++) {
            int numeroIngresado = scanner.nextInt();

            if (numeroIngresado < 0) {
                System.out.println("has digitado un número incorrecto Game Over");
            } else {
                if (numeroIngresado == numeroAleatorio) {
                    System.out.println("Felicidades, has acertado!" +
                            " el numero es: " + numeroAleatorio+" lo has hecho en "+ (i + 1) + " intentos de "+numeroIntentos +" restantes");
                    break;
                }else {
                    if (numeroIngresado != numeroAleatorio) {
                        System.out.println("el numero es incorrecto tienes " + (numeroIntentos --) + " intentos restantes");
                        if (numeroIngresado<numeroAleatorio) {
                            System.out.println("el numero es mayor");
                        }else {
                            System.out.println("el numero es menor");
                        }
                    }
                }
            }

        }

    }

}
