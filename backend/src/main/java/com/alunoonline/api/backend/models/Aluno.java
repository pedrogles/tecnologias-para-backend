package com.alunoonline.api.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data // Getters and Setters.
@NoArgsConstructor // Cria construtor sem argumentos.
@AllArgsConstructor // Cria construtor com argumentos.
@Entity // Cria uma entidade.

public class Aluno implements Serializable { // implementação para o banco de dados.

    @Id // Primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // i++
    private Long id;

    private String nome;

    private String email;

    private String curso;
}
