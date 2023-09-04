package com.unitins.projeto_amigo10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unitins.projeto_amigo10.model.Voluntario;

@Repository
public interface VoluntarioRepository extends JpaRepository<Voluntario, Long> {

	@Query(nativeQuery = true ,
			value = "select count(v.id) from voluntario v ;")
      Integer voluntarioSolicitado();
	
	@Query(nativeQuery = true ,
			value = "select count(v.id) from voluntario v where v.ativo='false';")
	Integer voluntariosInativos();
	
	
	@Query(nativeQuery = true ,
			value = "select count(v.id) from voluntario v where v.ativo='true';")
	Integer voluntariosAtivos();
	
	
	@Query(nativeQuery = true ,
			value = "select * from voluntario v;")
	List<Voluntario> listarVoluntariosSolicitados();
	
	
	@Query(nativeQuery = true ,
			value = "select * from voluntario v where v.ativo='true';")
	List<Voluntario> listarAtivos();
	
	@Query(nativeQuery = true ,
			value = "select * from voluntario v where v.ativo='false';")
	List<Voluntario> listarInativos();
	
	
}
