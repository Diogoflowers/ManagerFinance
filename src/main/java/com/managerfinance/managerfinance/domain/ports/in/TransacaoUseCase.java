package com.managerfinance.managerfinance.domain.ports.in;

import com.managerfinance.managerfinance.domain.model.Transacao;

public interface TransacaoUseCase {
    Transacao adicionarTransacao(Transacao transacao);

}
