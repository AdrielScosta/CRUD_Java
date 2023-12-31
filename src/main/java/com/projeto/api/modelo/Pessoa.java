package com.projeto.api.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
}
