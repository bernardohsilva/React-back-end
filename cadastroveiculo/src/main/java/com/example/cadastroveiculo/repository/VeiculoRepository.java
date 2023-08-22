package com.example.cadastroveiculo.repository;


import com.example.cadastroveiculo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
