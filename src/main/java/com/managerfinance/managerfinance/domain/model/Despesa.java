package com.managerfinance.managerfinance.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa {

    private BigDecimal valor;
    private TipoDespesa tipo;
    private String descricao;
    private LocalDate data;
    private Categoria categoria;
    private Usuario usuario;

    public Despesa() {}

    public Despesa(BigDecimal valor, TipoDespesa tipo, String descricao, LocalDate data, Categoria categoria, Usuario usuario) {

        this.valor = valor;
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
        this.categoria = categoria;
        this.usuario = usuario;
    }





    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoDespesa getTipo() {
        return tipo;
    }

    public void setTipo(TipoDespesa tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
