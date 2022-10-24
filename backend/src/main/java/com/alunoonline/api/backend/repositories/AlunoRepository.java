package com.alunoonline.api.backend.repositories;

import com.alunoonline.api.backend.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> { // Parametros <Classe, tipo da classe>

}
