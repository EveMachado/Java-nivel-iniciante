import java.util.Scanner;

public class CalculadoraTriangulo {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.print("digite o x: ");
        x.a = ent.nextDouble();
        x.b = ent.nextDouble();
        x.c = ent.nextDouble();

        System.out.print("digite o y: ");
        y.a = ent.nextDouble();
        y.b = ent.nextDouble();
        y.c = ent.nextDouble();

        double areax = x.area();
        double areay = y.area();

        System.out.printf("a área do triângulo x é: %.4f%n", areax);
        System.out.printf("a área do triângulo y é: %.4f%n", areay);

        if (areax > areay) {
          System.out.println("maior: x");
        } else {
          System.out.println("maior: y");
        }
    }


}
