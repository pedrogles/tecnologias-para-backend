package com.alunoonline.api.backend.services;

import com.alunoonline.api.backend.models.Aluno;
import com.alunoonline.api.backend.models.Professor;
import com.alunoonline.api.backend.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository repository;

    public Professor create(Professor professor) {
        return repository.save(professor);
    }
    public List<Professor> findAll() {
        return repository.findAll();
    }

    public Optional<Professor> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
