package com.unitins.projeto_amigo10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unitins.projeto_amigo10.model.Contribuinte;

@Repository
public interface ContribuinteRepository extends JpaRepository<Contribuinte, Long>{

	
	
	@Query(nativeQuery = true ,
			value = " select count(contribuinte.id) from contribuinte where recebido = 'false'; ")
	Integer contibuicoesPendentes();
	
	
	@Query(nativeQuery = true ,
			value = " select count(contribuinte.id) from contribuinte where recebido = 'true'; ")
	Integer contribuicoesPagas();
	
	
	@Query(nativeQuery = true ,
			value = " select * from contribuinte where recebido = 'false'; ")
	List<Contribuinte> listarPendentes();
	
	@Query(nativeQuery = true ,
			value = " select * from contribuinte where recebido = 'true'; ")
	List<Contribuinte> listarPagos();
}
