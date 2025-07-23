package com.managerfinance.managerfinance.domain.ports.in;

import com.managerfinance.managerfinance.domain.model.Despesa;

public interface DespesaUseCase {
    Despesa adicionarDespesa(Despesa despesa);

}