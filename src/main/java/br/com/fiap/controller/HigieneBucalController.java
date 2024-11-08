package br.com.fiap.controller;

import br.com.fiap.model.HigieneBucal;
import br.com.fiap.service.HigieneBucalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/higiene")
public class HigieneBucalController {

    @Autowired
    private HigieneBucalService service;

    @PostMapping
    public HigieneBucal salvar(@RequestBody HigieneBucal higieneBucal) {
        return service.salvar(higieneBucal);
    }
}
