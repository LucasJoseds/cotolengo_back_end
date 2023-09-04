package com.unitins.projeto_amigo10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unitins.projeto_amigo10.model.ComprovanteDoacao;

@Repository
public interface ComprovanteDoacaoRepository extends JpaRepository<ComprovanteDoacao, Long> {

	@Query(nativeQuery = true ,
			value = " select * from comprovante_doacao as c , doador as d where c.doador_id = d.id and d.id =:id")
	List<ComprovanteDoacao> hitoricoPagamentos(@Param ("id") Long id);

}
