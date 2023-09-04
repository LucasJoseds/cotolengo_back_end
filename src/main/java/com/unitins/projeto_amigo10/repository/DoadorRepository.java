package com.unitins.projeto_amigo10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unitins.projeto_amigo10.model.Doador;

@Repository
public interface DoadorRepository extends JpaRepository<Doador, Long> {

	
	@Query(nativeQuery = true ,
			value = " select count(d.id) from doador d left join comprovante_doacao c on c.doador_id =d.id WHERE c.id IS NULL; ")	
	Integer pagamentosPendentes();
	
	@Query(nativeQuery = true ,
			value = " select count(d.id) from doador d right join comprovante_doacao c on c.doador_id =d.id; ")
	Integer pagamentosFeitos();
	
	@Query(nativeQuery = true ,
			value = " select count(doador.id) from doador where data_contribuicao < CURRENT_DATE; ")
	Integer pagamentosVencidos();
	
	@Query(nativeQuery = true ,
			value = "select count(doador.id) from doador where ativo = 'false'; ")
	Integer doadoresInativos();
	
	@Query(nativeQuery = true ,
			value = "select sum(d.valor) from doador d left join comprovante_doacao c on c.doador_id =d.id WHERE c.id IS NULL; ")
	Double somaPendentes();
	
	@Query(nativeQuery = true ,
			value = " select sum(d.valor) from doador d right join comprovante_doacao c on c.doador_id =d.id; ")
	Double somaPagamentosFeitos();
	
	@Query(nativeQuery = true ,
			value = " select sum(doador.valor) from doador where data_contribuicao < CURRENT_DATE; ")
	Double somaVencidos();
	
	
	@Query(nativeQuery = true ,
			value = " select * from doador d left join comprovante_doacao c on c.doador_id =d.id WHERE c.id IS NULL; ")
	List<Doador> listarPendentes();
	
	@Query(nativeQuery = true ,
			value = " select * from doador d right join comprovante_doacao c on c.doador_id =d.id; ")
	List<Doador> listarPagos();
	
	
	@Query(nativeQuery = true ,
			value = " select * from doador where data_contribuicao < CURRENT_DATE;")
	List<Doador> listarVencidos();
	
	@Query(nativeQuery = true ,
			value = " select * from doador where ativo = 'false';")
	List<Doador> listarInativos();
	
	

	
	
	
	
	
	
	
	
	
}
