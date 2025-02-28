package com.aula;

public class Produto {// classe
    
        String nome; 
        Status status; 
        double preco;


       public Produto(String nome, Status status, double preco){
            this.nome = nome;
            this.status = status;
            this.preco = preco;
        }

        void mostrarInfo(){ //metodo mostrar informação
            System.out.println(nome);

            switch (status) { //switch case sobre status enum
                case NORMAL:
                System.out.println("Produto normal");
                    break;
                case PROMOCAO:
                System.out.println("Produto em promoção! 20% de desconto");
                break;

                case BAIXO_ESTOQUE:
                System.out.println("Produto em baixo estoque");
                break;
                default:
                System.out.println("Não encontrado, digite novamente.");
                break;
            }
        }

        void valorProduto(){ //metodo mostrar o valor do produto

            switch (status) {
                case NORMAL:
                System.out.println("sem alteração.");
                case PROMOCAO:
                preco = preco -(preco*0.20);
                System.out.println(preco);
                break;
                case BAIXO_ESTOQUE:
                preco = preco +(preco*0.10);
                System.out.println(preco);
                break;
                default:
                System.out.println("Não encontrado, digite novamente.");
                break;

            
        }
    }

}

