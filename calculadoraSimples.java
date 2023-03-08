import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o primeiro número: ");
            num1 = input.nextDouble();

            System.out.println("Digite o segundo número: ");
            num2 = input.nextDouble();

            System.out.println("Digite o operador (+, -, * ou /): ");
            operador = input.next().charAt(0);

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + resultado);
                    break;
                case '/':
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                    break;
                default:
                    System.out.println("Operador inválido.");
                    break;
            }

            System.out.println("Deseja continuar? (s/n)");
            char resposta = input.next().charAt(0);

            if (resposta == 'n' || resposta == 'N') {
                continuar = false;
            }
        }

        input.close();
    }
}
