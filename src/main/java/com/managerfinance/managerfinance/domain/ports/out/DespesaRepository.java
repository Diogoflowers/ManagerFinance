package com.managerfinance.managerfinance.domain.ports.out;

import com.managerfinance.managerfinance.adapters.out.persistence.entity.DespesaJpaEntity;
import com.managerfinance.managerfinance.domain.model.Despesa;

import java.util.List;


public interface DespesaRepository {
    Despesa salvar(DespesaJpaEntity despesa);
    void excluir(Long id);
    List<Despesa> listar(Long id);

}
