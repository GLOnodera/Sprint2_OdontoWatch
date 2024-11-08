package br.com.fiap.repository;

import br.com.fiap.model.RiscoPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiscoPacienteRepository extends JpaRepository<RiscoPaciente, Long> {
}
