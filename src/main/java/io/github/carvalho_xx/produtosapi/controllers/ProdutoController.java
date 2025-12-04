package io.github.carvalho_xx.produtosapi.controllers;

import io.github.carvalho_xx.produtosapi.model.Produto;
import io.github.carvalho_xx.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);

        System.out.println("Produto recebido: " + produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorID(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletarPorId(@PathVariable String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void atualizarPorId(@PathVariable String id, @RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);
    }

}
