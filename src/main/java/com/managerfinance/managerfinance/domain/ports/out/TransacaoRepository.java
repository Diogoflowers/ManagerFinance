package com.managerfinance.managerfinance.domain.ports.out;

import com.managerfinance.managerfinance.adapters.out.persistence.TransacaoJpaEntity;
import com.managerfinance.managerfinance.domain.model.Transacao;


public interface TransacaoRepository {
    Transacao salvar(TransacaoJpaEntity transacao);

}
