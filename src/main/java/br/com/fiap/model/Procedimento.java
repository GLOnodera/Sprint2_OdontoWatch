package br.com.fiap.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "procedimentos")
public class Procedimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataProcedimento;

    private String tipoProcedimento;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataProcedimento() {
        return dataProcedimento;
    }

    public void setDataProcedimento(LocalDate dataProcedimento) {
        this.dataProcedimento = dataProcedimento;
    }

    public String getTipoProcedimento() {
        return tipoProcedimento;
    }

    public void setTipoProcedimento(String tipoProcedimento) {
        this.tipoProcedimento = tipoProcedimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
