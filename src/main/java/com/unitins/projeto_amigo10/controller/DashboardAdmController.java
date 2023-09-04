package com.unitins.projeto_amigo10.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitins.projeto_amigo10.model.Contribuinte;
import com.unitins.projeto_amigo10.model.Doador;
import com.unitins.projeto_amigo10.model.Voluntario;
import com.unitins.projeto_amigo10.service.ContribuinteService;
import com.unitins.projeto_amigo10.service.DoadorService;
import com.unitins.projeto_amigo10.service.VoluntarioService;

@RestController
@RequestMapping(value = "/dashboard")
public class DashboardAdmController {

	//@Autowired
	//private DoadorService doadorService;

	//@Autowired
	//private ContribuinteService contribuinteService;

	//@Autowired
	//private VoluntarioService voluntarioService;

	// DOADORES

	// Lista a quantidade de doadores que ainda não pagou
	
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	//@GetMapping(value = "/doador/quantidade-pendentes")
	//public Integer qtdPendentes() {

		//Integer pendentes = doadorService.pagamentosPendentes();

		//return pendentes;
//	}

	/// Lista a quantidade de doadores que efeturaram o pagamento
//@GetMapping(value = "/doador/quantidade-pagos")
	//public Integer qtdPagos() {

		//Integer pagos = doadorService.pagamentosFeitos();
//
	//	return pagos;

	//}

	//@GetMapping(value = "/doador/quantidade-vencidos")
	//public Integer qtdVencidos() {
	//	Integer vencidos = doadorService.pagamentosVencidos();
	//	return vencidos;

	//}
//
	//@GetMapping(value = "/doador/quantidade-inativos")
	//public Integer qtdInativos() {
	//	Integer inativos = doadorService.doadoresInativos();
	//	return inativos;
	//}

	//@GetMapping(value = "/doador/valor-pendente")
//	@RolesAllowed(value = )
//	public Double somarPendentes() {

	//	Double soma = doadorService.somaPendentes();
	//	return soma;
	//}

	//@GetMapping(value = "/doador/valor-pago")
	//public Double somarPagos() {

	//	Double somaPagos = doadorService.somaPagos();
	//	return somaPagos;
	//}

	//@GetMapping(value = "/doador/valor-vencido")
	//public Double somaVencidos() {

		//Double somaVencido = doadorService.somaVencidos();
		//return somaVencido;
	//}

	//@GetMapping(value = "/doador/listar-pendentes")
	//public List<Doador> listarDoadores() {

		//List<Doador> listaPendentes = doadorService.listarPendentes();

		//return listaPendentes;
	//}

	//@GetMapping(value = "/doador/listar-pagos")
	//public List<Doador> listarDoadoresPagos() {

		//List<Doador> listaPagos = doadorService.listarPagos();

		//return listaPagos;
	//}

	//@GetMapping(value = "/doador/listar-vencidos")
	//public List<Doador> listarDoadoresVencidos() {

	//	List<Doador> listaVencidos = doadorService.listarVencidos();

	//	return listaVencidos;
	//}

//	@GetMapping(value = "/doador/listar-inativos")
	//public List<Doador> listarDoadoresIativos() {
//
	//	List<Doador> listaInativos = doadorService.listarInativos();

		//return listaInativos;
	//}

	// CONTRIBUINTES

	//@GetMapping(value = "/contribuinte/pendentes")
//	public Integer contribuicaoPendente() {

	//	Integer pendente = contribuinteService.contribuicaoPendente();
//
	//	return pendente;
	//}

	//@GetMapping(value = "/contribuinte/pagos")
	//public Integer contribuicaoPaga() {

		//Integer pagos = contribuinteService.contribuicaoPaga();

		//return pagos;
	//}

	//@GetMapping(value = "/contribuinte/listar-pendentes")
	//public List<Contribuinte> listarPendentes() {

		//List<Contribuinte> listaPendentes = contribuinteService.listarPendentes();

	//	return listaPendentes;
	//}

	//@GetMapping(value = "/contribuinte/listar-pagos")
	//public List<Contribuinte> listarPagos() {

		//List<Contribuinte> listaPagos = contribuinteService.listarPendentes();

		//return listaPagos;
	//}

	
	
	// VOLUNTÁRIOS

	//@GetMapping(value = "/voluntarios-solicitados")
	//public Integer voluntariosSolicitados() {

		//Integer solicitado = voluntarioService.solicitados();

		//return solicitado;

	//}

	//@GetMapping(value = "/voluntario/inativos")
	//public Integer voluntariosInativos() {
//		Integer inativos = voluntarioService.inativos();
//
	//	return inativos;
	//}

	//@GetMapping(value = "/voluntario/ativos")
	//public Integer voluntariosAtivos() {
	//	Integer ativos = voluntarioService.ativos();

	//	return ativos;
	//}
	
	//@GetMapping(value = "/voluntario/listar-solicitados")
	//public List<Voluntario> litarSolicitados(){
		
		///List<Voluntario> listaSolicitados = voluntarioService.listarSolicitados();
		
		//return listaSolicitados;
	//}
	
	//@GetMapping(value = "/voluntario/listar-inativos")
	//public List<Voluntario> litarInativos(){
		
		//List<Voluntario> listaInativos = voluntarioService.listarInativos();
		
	//	return listaInativos;
	//}
	
	//@GetMapping(value = "/voluntario/listar-ativos")
	//public List<Voluntario> litarAtivos(){
		
	//	List<Voluntario> listaAtivos = voluntarioService.listarAtivos();
		
	//	return listaAtivos;
	//}

}
