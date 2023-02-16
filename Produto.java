import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Insira dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("estoque: ");
        produto.estoque = sc.nextInt();


        System.out.println();
        System.out.println("dados dos produtos: " + produto);

        System.out.println();
        System.out.print("entre com o número de produtos para adicionar no estoque: ");
        int estoque = sc.nextInt();
        produto.addProdutos(estoque);

        System.out.println();
        System.out.println("dados novos: " + produto);

        System.out.println();
        System.out.print("entre com o número de produtos para tirar do estoque: ");
        estoque = sc.nextInt();
        produto.removerProduto(estoque);

        System.out.println();
        System.out.println("dados novos: " + produto);
    }
}
