import java.util.Scanner;

public class Produto {

    private final String  NOME;
    private final double PRECO;
    private int estoque;

    public Produto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira dados do produto: ");
        System.out.print("Nome: ");
        this.NOME = scanner.nextLine();
        System.out.print("preço: ");
        this.PRECO = scanner.nextDouble();
        System.out.print("estoque: ");
        this.estoque = scanner.nextInt();

    }

    public double totalNoEstoque() {
        return PRECO * estoque;
    }

    public void addProdutos(int estoque) {
        this.estoque += estoque;
    }

    public void removerProduto(int estoque) {
        this.estoque -= estoque;
    }

    public String toString() {
        return NOME
                + ", $ "
                + String.format("%.2f", PRECO)
                + ", "
                + estoque
                + " unidades, total: $ "
                + String.format("%.2f", totalNoEstoque());
    }
}
