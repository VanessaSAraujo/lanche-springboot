package com.lanchenlayer.applications;

import com.lanchenlayer.entities.Produto;
import com.lanchenlayer.repositories.ProdutoRepository;
import com.lanchenlayer.services.ProdutoService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ProdutoApplication {
    private ProdutoRepository produtoRepository;
    private ProdutoService produtoService;

    public ProdutoApplication(ProdutoRepository produtoRepository, ProdutoService produtoService) {
        this.produtoRepository = produtoRepository;
        this.produtoService = produtoService;
    }

    public void adicionar(Produto produto) {
        this.produtoRepository.adicionar(produto);
        this.produtoService.salvarImagem(produto);
    }

    public void adicionarSoImagem(Produto produto) {
        this.produtoService.salvarImagem(produto);
    }

    public void remover(int id) {
        this.produtoRepository.remover(id);
        this.produtoService.removerImagem(id);
    }

    public Produto buscarPorId(int id) {
        return this.produtoRepository.buscarPorId(id);
    }

    public ArrayList<Produto> buscarTodos() {
        return this.produtoRepository.buscarTodos();
    }

    public float vender(int id, int quantidade) {
        Produto produto = this.produtoRepository.buscarPorId(id);
        return produto.vender(quantidade);
    }

    public void atualizarProduto(int id, Produto produto) {
        this.produtoRepository.atualizarProduto(id, produto);
        this.produtoService.atualizarImagem(produto);
    }
}
