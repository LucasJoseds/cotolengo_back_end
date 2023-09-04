package com.unitins.projeto_amigo10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unitins.projeto_amigo10.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
