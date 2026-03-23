package com.example.aprend_spring.Service;

import com.example.aprend_spring.Model.ChamadoEntity;
import com.example.aprend_spring.Repository.ChamadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChamadoService {

    private ChamadoRepository chamadoRepository;

    public ChamadoService (ChamadoRepository chamadoRepository){
        this.chamadoRepository = chamadoRepository;
    }

    public List<ChamadoEntity> listarChamados(){
        return chamadoRepository.findAll();
    }

    public Optional<ChamadoEntity> chamadoPorId(Long id){
        return chamadoRepository.findById(id);
    }

    public ChamadoEntity criarproduto(ChamadoEntity chamado){
        return chamadoRepository.save(chamado);
    }
}
