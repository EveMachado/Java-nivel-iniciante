import java.util.Random;
import java.util.Scanner;
public class Adivinhacao {

    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(500)+1;
        Scanner entrada = new Scanner(System.in);
        int palpite;

        do {
            System.out.print("digite um número(1-500): ");
            palpite = entrada.nextInt();
            if (palpite > numeroAleatorio){
                System.out.println("menor");
            }
            else if (palpite < numeroAleatorio){
                System.out.println("maior");
            }
        }
        while (palpite != numeroAleatorio);
        System.out.println("você acertou!");

    }

}



