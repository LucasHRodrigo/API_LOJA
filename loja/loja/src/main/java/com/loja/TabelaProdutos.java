package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    //No construtor, a lista de produtos sera preenchida :)
    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "Caneta BIC na cor azul", 1.99);
        Produto borracha = new Produto(1, "Borracha Branca", "Borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lapis Faber Castel", "Lapis Faber Castel Comum", 2.99);
        Produto apontador = new Produto(4, "Apontador", "Apontador comum com reservatório", 5.99);
        Produto caderno = new Produto(5, "Caderno com espiral", "Caderno espiral com 96 folhas", 15.99);
        Produto caderno2 = new Produto(6, "Caderno com espiral", "Caderno espiral com 360 folhas", 35.99);
        Produto cadernoSemPauta = new Produto(7, "Caderno sem pauta", "Caderno sem pauta com 90 folhas", 11.99;

        this.produtos.add(caneta);
        this.produtos.add(lapis);
        this.produtos.add(borracha);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
        this.produtos.add(caderno2);
        this.produtos.add(cadernoSemPauta);
    }
}
