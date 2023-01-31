import java.util.Scanner;
public class BoletimEscolar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite sua nota: ");
        int mediaFinal = entrada.nextInt();
        if (mediaFinal<6)
            System.out.println("reprovado");
        else if (mediaFinal==6)
            System.out.println("fazer provinha");
        else
            System.out.println("aprovado");
    }
}
