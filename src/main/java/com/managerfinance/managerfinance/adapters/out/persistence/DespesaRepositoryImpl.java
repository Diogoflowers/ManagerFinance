package com.managerfinance.managerfinance.adapters.out.persistence;

import com.managerfinance.managerfinance.domain.model.Despesa;
import com.managerfinance.managerfinance.domain.ports.out.DespesaRepository;

public class DespesaRepositoryImpl implements DespesaRepository{

    private DespesaJpaRepository repository;
    @Override
    public Despesa salvar(DespesaJpaEntity despesa) {
        DespesaJpaEntity newDespesa = repository.save(despesa);
        return DespesaJpaEntity.toDomain(newDespesa);
    }
}
