package com.example.aprend_spring.Repository;

import com.example.aprend_spring.Model.ChamadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadoRepository extends JpaRepository<ChamadoEntity, Long> {
}
