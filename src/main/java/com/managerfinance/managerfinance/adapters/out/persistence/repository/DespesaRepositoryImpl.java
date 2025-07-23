package com.managerfinance.managerfinance.adapters.out.persistence.repository;

import com.managerfinance.managerfinance.adapters.out.persistence.entity.DespesaJpaEntity;
import com.managerfinance.managerfinance.domain.model.Despesa;
import com.managerfinance.managerfinance.domain.ports.out.DespesaRepository;

import java.util.List;

public class DespesaRepositoryImpl implements DespesaRepository{

    private DespesaJpaRepository repository;
    @Override
    public Despesa salvar(DespesaJpaEntity despesa) {

        DespesaJpaEntity newDespesa = repository.save(despesa);
        return DespesaJpaEntity.toDomain(newDespesa);
    }

    @Override
    public void excluir(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Despesa> listar(Long id) {
        return repository.findByUsuarioId(id).stream().map(despesaJpaEntity -> {
            return new Despesa(despesaJpaEntity.getValor(), despesaJpaEntity.getTipo(), despesaJpaEntity.getDescricao(), despesaJpaEntity.getData(), despesaJpaEntity.getCategoria());

        }).toList();
    }


}
