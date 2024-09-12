package com.lanchenlayer.controllers;

import com.lanchenlayer.entities.Produto;
import com.lanchenlayer.facade.ProdutoFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    private final ProdutoFacade produtoFacade;

    public ProdutoController(ProdutoFacade produtoFacade) {
        this.produtoFacade = produtoFacade;
    }

    @GetMapping("/buscarProdutos")
    public ResponseEntity<List<Produto>> buscarTodos() {
        List<Produto> produtos = produtoFacade.buscarTodos();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/buscarProduto/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable int id) {
        Produto produto = produtoFacade.buscarPorId(id);
        return ResponseEntity.ok(produto);
    }

}
