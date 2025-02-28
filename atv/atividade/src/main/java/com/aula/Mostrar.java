package com.aula;

public class Mostrar {
    
    public static void main(String[] args) {

        Produto produto = new Produto("Abacaxi", Status.NORMAL, 0); // entrada de informação
        produto.mostrarInfo(); //chama os metodos mostrar e o valor do produto
        produto.valorProduto();

        Produto produto3 = new Produto("Mamão", Status.BAIXO_ESTOQUE, 10);
        produto3.mostrarInfo();
        produto3.valorProduto();

        Produto produto4 = new Produto("Morango",Status.PROMOCAO, 8.50);
        produto4.mostrarInfo();
        produto4.valorProduto();
    }

}
