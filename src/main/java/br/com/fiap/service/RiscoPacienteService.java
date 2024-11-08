package br.com.fiap.service;

import br.com.fiap.model.RiscoPaciente;
import br.com.fiap.repository.RiscoPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiscoPacienteService {

    @Autowired
    private RiscoPacienteRepository repository;

    public RiscoPaciente salvar(RiscoPaciente riscoPaciente) {
        return repository.save(riscoPaciente);
    }
}
