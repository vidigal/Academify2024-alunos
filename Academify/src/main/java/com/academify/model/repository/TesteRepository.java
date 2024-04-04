package com.academify.model.repository;

import com.academify.model.entity.Teste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TesteRepository extends JpaRepository<Teste, Integer> {
}
