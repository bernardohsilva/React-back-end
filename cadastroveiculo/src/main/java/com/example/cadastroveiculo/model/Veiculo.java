package com.example.cadastroveiculo.model;
import jakarta.persistence.*;

@Entity
public class Veiculo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String montadora;
    private String modelo;
    private int ano;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String Placa) {
        this.placa = Placa;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String Montadora) {
        this.montadora = Montadora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int Ano) {
        this.ano = Ano;
    }


    
    
}
