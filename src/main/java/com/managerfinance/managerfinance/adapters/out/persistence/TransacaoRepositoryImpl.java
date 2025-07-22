package com.managerfinance.managerfinance.adapters.out.persistence;

import com.managerfinance.managerfinance.domain.model.Transacao;
import com.managerfinance.managerfinance.domain.ports.out.TransacaoRepository;

public class TransacaoRepositoryImpl implements TransacaoRepository {

   private TransacaoJpaRepository repositoryJpa;

    @Override
    public Transacao salvar(TransacaoJpaEntity transacao) {
        repositoryJpa.save(transacao);
        return TransacaoJpaEntity.toDomain(transacao);



    }
}
