package br.com.fiap.controller;

import br.com.fiap.model.Notificacao;
import br.com.fiap.service.NotificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notificacao")
public class NotificacaoController {

    @Autowired
    private NotificacaoService service;

    @PostMapping
    public Notificacao salvar(@RequestBody Notificacao notificacao) {
        return service.salvar(notificacao);
    }
}
