package com.managerfinance.managerfinance.adapters.out.persistence.repository;

import com.managerfinance.managerfinance.adapters.out.persistence.entity.UsuarioJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaRepository extends JpaRepository<UsuarioJpaEntity, Long> {
}
