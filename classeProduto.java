public class Produto {

   public String nome;
   public double preco;
   public int estoque;

   public double totalNoEstoque(){
       return preco*estoque;
   }
   public void addProdutos(int estoque){
       this.estoque += estoque;
   }
   public void removerProduto(int estoque){
       this.estoque -= estoque;
   }
   public String toString(){
       return nome
           + ", $ "
           + String.format("%.2f", preco)
           + ", "
           + estoque
           + " unidades, total: $ "
           + String.format("%.2f", totalNoEstoque());
   }
}
