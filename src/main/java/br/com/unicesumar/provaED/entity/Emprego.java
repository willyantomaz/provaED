package br.com.unicesumar.provaED.entity;

import jakarta.persistence.*;

@Entity(name = "EMPREGO")
@Table(name = "EMPREGO")
public class Emprego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String endereco;

    public Emprego() {
    }

    public Emprego(Integer id, String endereco) {
        this.id = id;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
