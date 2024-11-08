package br.com.fiap.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;


import java.util.Date;

@Entity
public class Consulta {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date dataConsulta;

    @ManyToOne
    @JoinColumn(name = "ID_Dentista", nullable = false)
    private Dentista dentista;  // Tipo de relacionamento correto

    @ManyToOne
    @JoinColumn(name = "ID_Paciente", nullable = false)
    private Paciente paciente;

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
