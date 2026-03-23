package com.example.aprend_spring.Controller;

import com.example.aprend_spring.Model.ChamadoEntity;
import com.example.aprend_spring.Service.ChamadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/chamado")
public class ChamadoController {

    private ChamadoService chamadoService;

    public ChamadoController(ChamadoService chamadoService){
        this.chamadoService = chamadoService;
    }

    @PostMapping
    public ChamadoEntity abrirChamado(@RequestBody ChamadoEntity chamado){
        return chamadoService.criarchamado(chamado);
    }

    @GetMapping
    public List<ChamadoEntity> mostrarChamados(){
        return chamadoService.listarChamados();
    }

    @GetMapping("/{id}")
    public Optional<ChamadoEntity> mostrarChamadoPorId(@PathVariable Long id){
        return chamadoService.chamadoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarChamado(@PathVariable Long id){
        chamadoService.deletarChamado(id);
    }

    @PatchMapping("/{id}")
    public ChamadoEntity atualizaChamado (@PathVariable Long id, @RequestBody ChamadoEntity chamado){
        return chamadoService.atualizaChamado(id, chamado);
    }

}
