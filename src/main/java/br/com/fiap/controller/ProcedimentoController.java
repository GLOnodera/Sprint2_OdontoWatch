package br.com.fiap.controller;

import br.com.fiap.model.Procedimento;
import br.com.fiap.service.ProcedimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/procedimentos")
public class ProcedimentoController {
    @Autowired
    private ProcedimentoService procedimentoService;

    @GetMapping
    public List<Procedimento> listarProcedimentos() {
        return procedimentoService.listarProcedimentos();
    }

    @PostMapping
    public ResponseEntity<Procedimento> cadastrarProcedimento(@RequestBody Procedimento procedimento) {
        return ResponseEntity.ok(procedimentoService.salvarProcedimento(procedimento));
    }
}
