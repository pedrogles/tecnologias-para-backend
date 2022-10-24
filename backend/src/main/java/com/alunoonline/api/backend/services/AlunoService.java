package com.alunoonline.api.backend.services;

import com.alunoonline.api.backend.models.Aluno;
import com.alunoonline.api.backend.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Identificando como service.
public class AlunoService {

    @Autowired // Injetando dependencia (Repository)
    AlunoRepository repository; // Ligando a uma variável Repository.

    public Aluno create(Aluno aluno) { // Método de cadastrar aluno.
        return repository.save(aluno); // Cadastrar aluno no db.
    }
    public List<Aluno> findAll() {
        return repository.findAll();
    }

    public Optional<Aluno> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
