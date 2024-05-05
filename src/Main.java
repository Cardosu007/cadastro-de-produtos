public class Main {
    public static void main(String[] args) {

    CadastroProdutos cadastroProdutos = new CadastroProdutos();


        cadastroProdutos.adicionarProduto("Produto 5", 1L, 15d, 5);
        cadastroProdutos.adicionarProduto("Produto 2", 2L, 25d, 2);
        cadastroProdutos.adicionarProduto("Produto 3", 3L, 5d, 3);
        cadastroProdutos.adicionarProduto("Produto 4", 4L, 18d, 9);
        cadastroProdutos.adicionarProduto("Produto 1", 5L, 37d, 1);

        //System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());



    }
}