package br.com.fiap.controller;

import br.com.fiap.model.Consulta;
import br.com.fiap.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaService service;

    @PostMapping
    public Consulta salvar(@RequestBody Consulta consulta) {
        return service.salvar(consulta);
    }
}
