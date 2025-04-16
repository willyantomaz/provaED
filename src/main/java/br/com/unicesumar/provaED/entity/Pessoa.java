package br.com.unicesumar.provaED.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "PESSOA")
@Table(name = "PESSOA")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private Integer idade;

    @OneToMany
    private List<Emprego> emprego;

    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, Integer idade, List<Emprego> emprego) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.emprego = emprego;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Emprego> getEmprego() {
        return emprego;
    }

    public void setEmprego(List<Emprego> emprego) {
        this.emprego = emprego;
    }
}
