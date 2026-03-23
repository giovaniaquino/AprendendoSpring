package com.example.aprend_spring.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "chamados")
public class ChamadoEntity {

    private enum StatusChamado {
        ABERTO,
        FECHADO,
        EM_ANDAMENTO
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusChamado status;

    @PrePersist
    public void prePersist(){
        if (this.status == null){
            this.status = StatusChamado.ABERTO;
        }
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusChamado getStatus() {
        return status;
    }

    public void setStatus(StatusChamado status) {
        this.status = status;
    }
}
