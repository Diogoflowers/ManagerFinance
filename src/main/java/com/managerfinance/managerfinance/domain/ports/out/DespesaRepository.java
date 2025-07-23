package com.managerfinance.managerfinance.domain.ports.out;

import com.managerfinance.managerfinance.adapters.out.persistence.DespesaJpaEntity;
import com.managerfinance.managerfinance.domain.model.Despesa;


public interface DespesaRepository {
    Despesa salvar(DespesaJpaEntity despesa);


}
