package br.com.fiap.service;

import br.com.fiap.model.Procedimento;
import br.com.fiap.repository.ProcedimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcedimentoService {
    @Autowired
    private ProcedimentoRepository procedimentoRepository;

    public List<Procedimento> listarProcedimentos() {
        return procedimentoRepository.findAll();
    }

    public Procedimento salvarProcedimento(Procedimento procedimento) {
        return procedimentoRepository.save(procedimento);
    }
}
