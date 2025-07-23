package com.managerfinance.managerfinance.application.service;
import com.managerfinance.managerfinance.adapters.out.persistence.entity.DespesaJpaEntity;
import com.managerfinance.managerfinance.domain.model.Despesa;
import com.managerfinance.managerfinance.domain.ports.in.DespesaUseCase;
import com.managerfinance.managerfinance.domain.ports.out.DespesaRepository;

import java.util.List;


public class DespesaService implements DespesaUseCase {

    private DespesaRepository despesaRepository;

    @Override
    public Despesa adicionarDespesa(Despesa despesa) {
        DespesaJpaEntity newDespesa = DespesaJpaEntity.fromDomain(despesa);
        return despesaRepository.salvar(newDespesa);
    }

    @Override
    public void excluirDespesa(Long id) {
        despesaRepository.excluir(id);
    }

    @Override
    public List<Despesa> listarDespesas(Long id) {
        return despesaRepository.listar(id);
    }
}
