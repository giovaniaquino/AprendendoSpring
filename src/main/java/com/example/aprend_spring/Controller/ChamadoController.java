package com.example.aprend_spring.Controller;

import com.example.aprend_spring.Model.ChamadoEntity;
import com.example.aprend_spring.Service.ChamadoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chamado")
public class ChamadoController {

    private ChamadoService chamadoService;

    public ChamadoController(ChamadoService chamadoService){
        this.chamadoService = chamadoService;
    }

    @PostMapping()
    public ChamadoEntity abrirChamado(@RequestBody ChamadoEntity chamado){
        return chamadoService.criarproduto(chamado);
    }
}
