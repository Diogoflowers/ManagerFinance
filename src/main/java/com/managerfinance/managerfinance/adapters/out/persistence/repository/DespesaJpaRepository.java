package com.managerfinance.managerfinance.adapters.out.persistence.repository;

import com.managerfinance.managerfinance.adapters.out.persistence.entity.DespesaJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DespesaJpaRepository extends JpaRepository<DespesaJpaEntity, Long> {
    List<DespesaJpaEntity> findByUsuarioId(Long usuarioId);
}
