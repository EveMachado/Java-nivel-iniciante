import java.util.Scanner;

public class programaProduto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;


        while (continuar) {
            Produto produto = new Produto();


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

            System.out.println("deseja ver outro produto? (s/n)");
            char resposta = sc.next().charAt(0);

            if(resposta == 'n' || resposta == 'N') {
                continuar = false;
            }
        }
    }
}
