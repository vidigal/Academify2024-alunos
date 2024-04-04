package com.academify.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="teste")
public class Teste {

    @Id
    private long id;

    private String campoTeste;
    private String campoTeste2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCampoTeste() {
        return campoTeste;
    }

    public void setCampoTeste(String campoTeste) {
        this.campoTeste = campoTeste;
    }

    public String getCampoTeste2() {
        return campoTeste2;
    }

    public void setCampoTeste2(String campoTeste2) {
        this.campoTeste2 = campoTeste2;
    }

}
