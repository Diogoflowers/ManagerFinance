package com.managerfinance.managerfinance.application.service;

import com.managerfinance.managerfinance.adapters.out.persistence.TransacaoJpaEntity;
import com.managerfinance.managerfinance.adapters.out.persistence.TransacaoJpaRepository;
import com.managerfinance.managerfinance.domain.model.Transacao;
import com.managerfinance.managerfinance.domain.ports.in.TransacaoUseCase;
import com.managerfinance.managerfinance.domain.ports.out.TransacaoRepository;

public class TransacaoService implements TransacaoUseCase {

    private final TransacaoRepository transacaoRepository;


    public TransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @Override
    public Transacao adicionarTransacao(Transacao transacao) {
        TransacaoJpaEntity newEntity = TransacaoJpaEntity.fromDomain(transacao);
        return transacaoRepository.salvar(newEntity);
    }
}
