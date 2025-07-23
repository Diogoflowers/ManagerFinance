package com.managerfinance.managerfinance.adapters.out.persistence;

import com.managerfinance.managerfinance.domain.model.Categoria;
import com.managerfinance.managerfinance.domain.model.TipoDespesa;
import com.managerfinance.managerfinance.domain.model.Despesa;
import com.managerfinance.managerfinance.domain.model.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDate;

@Table
@Entity
@Setter
@Getter
public class DespesaJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;
    private TipoDespesa tipo;
    private String descricao;
    private LocalDate data;
    private Categoria categoria;
    private Usuario usuario;

    public static DespesaJpaEntity fromDomain(Despesa despesa) {
        DespesaJpaEntity entity = new DespesaJpaEntity();
        entity.setValor(despesa.getValor());
        entity.setTipo(despesa.getTipo());
        entity.setDescricao(despesa.getDescricao());
        entity.setData(despesa.getData());
        return entity;
    }

    public static Despesa toDomain(DespesaJpaEntity entidade) {
        Despesa despesa = new Despesa();
        despesa.setValor(entidade.valor);
        despesa.setTipo(entidade.tipo);
        despesa.setDescricao(entidade.descricao);
        despesa.setData(entidade.data);
        return despesa;
    }
}
