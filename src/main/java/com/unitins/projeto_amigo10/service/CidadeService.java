package com.unitins.projeto_amigo10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitins.projeto_amigo10.model.Cidade;
import com.unitins.projeto_amigo10.model.Estado;
import com.unitins.projeto_amigo10.repository.CidadeRepository;
import com.unitins.projeto_amigo10.repository.EstadoRepository;


@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;
    
    @Autowired
    private EstadoRepository estadoRepository;

    public Cidade salvar(Cidade cidade){

        Cidade nCidade = new Cidade();
        nCidade.setNome(cidade.getNome());

        Estado estado = estadoRepository.findById(cidade.getEstado().getId()).get();
        nCidade.setEstado(estado);

        return cidadeRepository.save(nCidade);

    }

    public Cidade buscarCidade(Long id){
        return cidadeRepository.findById(id).get();
    }
}
