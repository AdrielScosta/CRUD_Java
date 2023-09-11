package com.projeto.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projeto.api.modelo.Pessoa;

public interface Repositorio extends CrudRepository <Pessoa, Integer> {
    List<Pessoa> findAll();
    Pessoa findByCodigo(int codigo);
}
