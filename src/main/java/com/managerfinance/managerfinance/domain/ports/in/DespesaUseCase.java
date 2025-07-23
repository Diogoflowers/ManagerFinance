package com.managerfinance.managerfinance.domain.ports.in;

import com.managerfinance.managerfinance.domain.model.Despesa;

import java.util.List;

public interface DespesaUseCase {
    Despesa adicionarDespesa(Despesa despesa);
    void excluirDespesa(Long id);
    List<Despesa> listarDespesas(Long id);

}