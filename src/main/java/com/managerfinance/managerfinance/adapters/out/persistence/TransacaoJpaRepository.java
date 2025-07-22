package com.managerfinance.managerfinance.adapters.out.persistence;

import com.managerfinance.managerfinance.domain.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoJpaRepository extends JpaRepository<TransacaoJpaEntity, Long> {

}
