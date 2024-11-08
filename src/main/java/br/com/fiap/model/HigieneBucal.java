package br.com.fiap.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
public class HigieneBucal {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date data;

    @Column(nullable = false)
    private boolean escovacaoFeita;

    @Column(nullable = false)
    private boolean usoFioDental;

    @ManyToOne
    @JoinColumn(name = "ID_Paciente", nullable = false)
    private Paciente paciente;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // Getters and Setters

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isEscovacaoFeita() {
        return escovacaoFeita;
    }

    public void setEscovacaoFeita(boolean escovacaoFeita) {
        this.escovacaoFeita = escovacaoFeita;
    }

    public boolean isUsoFioDental() {
        return usoFioDental;
    }

    public void setUsoFioDental(boolean usoFioDental) {
        this.usoFioDental = usoFioDental;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
