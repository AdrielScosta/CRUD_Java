package com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.api.modelo.Pessoa;
import com.projeto.api.repositorio.Repositorio;

@RestController

public class Apis {

    @Autowired
    private Repositorio acao;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj){
        return acao.save(obj);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/api")
    public Iterable<Pessoa> selecionar(){
        return acao.findAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/api/{codigo}")
    public Pessoa selecionarPessoa(@PathVariable int codigo){
        return acao.findByCodigo(codigo);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/api")
    public Pessoa editar(@RequestBody Pessoa obj){
        return acao.save(obj);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/api/{codigo}")
    public void remover(@PathVariable int codigo){
        Pessoa obj = selecionarPessoa(codigo);
        acao.delete(obj);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/")
    public String mensagem(){
        return "Página inicial";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
}



