package br.com.fiap.repository;

import br.com.fiap.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente findByEmail(String email);
}
