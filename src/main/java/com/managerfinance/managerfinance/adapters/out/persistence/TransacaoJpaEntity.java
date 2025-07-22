package com.managerfinance.managerfinance.adapters.out.persistence;

import com.managerfinance.managerfinance.domain.model.Categoria;
import com.managerfinance.managerfinance.domain.model.TipoTransacao;
import com.managerfinance.managerfinance.domain.model.Transacao;
import com.managerfinance.managerfinance.domain.model.Usuario;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDate;

@Table
@Entity
@Setter
@Getter
public class TransacaoJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;
    private TipoTransacao tipo;
    private String descricao;
    private LocalDate data;
    private Categoria categoria;
    private Usuario usuario;

    public static TransacaoJpaEntity fromDomain(Transacao transacao) {
        TransacaoJpaEntity entity = new TransacaoJpaEntity();
        entity.setValor(transacao.getValor());
        entity.setTipo(transacao.getTipo());
        entity.setDescricao(transacao.getDescricao());
        entity.setData(transacao.getData());
        return entity;
    }

    public static Transacao toDomain(TransacaoJpaEntity entidade) {
        Transacao transacao = new Transacao();
        transacao.setValor(entidade.valor);
        transacao.setTipo(entidade.tipo);
        transacao.setDescricao(entidade.descricao);
        transacao.setData(entidade.data);
        return transacao;
    }
}
