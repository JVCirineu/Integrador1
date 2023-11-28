package com.projetoIntegradorFunc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoIntegradorFunc.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {

}
