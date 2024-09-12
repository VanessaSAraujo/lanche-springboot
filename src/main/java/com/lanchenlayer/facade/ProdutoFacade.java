package com.lanchenlayer.facade;

import com.lanchenlayer.applications.ProdutoApplication;
import com.lanchenlayer.entities.Produto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ProdutoFacade {
    private final ProdutoApplication produtoApplication;

    public ProdutoFacade(ProdutoApplication produtoApplication) {
        this.produtoApplication = produtoApplication;
    }

    public void adicionar(Produto produto) {
        this.produtoApplication.adicionar(produto);
    }

    public void remover(int id) {
        this.produtoApplication.remover(id);
    }

    public Produto buscarPorId(int id) {
        return this.produtoApplication.buscarPorId(id);
    }

    public ArrayList<Produto> buscarTodos() {
        return this.produtoApplication.buscarTodos();
    }

    public float vender(int id, int quantidade) {
        return this.produtoApplication.vender(id, quantidade);
    }

    public void atualizarProduto(int id, Produto produto) {
        this.produtoApplication.atualizarProduto(id, produto);
    }
}
