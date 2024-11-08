package br.com.fiap.controller;

import br.com.fiap.model.RiscoPaciente;
import br.com.fiap.service.RiscoPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/risco")
public class RiscoPacienteController {

    @Autowired
    private RiscoPacienteService service;

    @PostMapping
    public RiscoPaciente salvar(@RequestBody RiscoPaciente riscoPaciente) {
        return service.salvar(riscoPaciente);
    }
}
