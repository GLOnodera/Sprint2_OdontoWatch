package br.com.fiap.service;

import br.com.fiap.model.Notificacao;
import br.com.fiap.repository.NotificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    @Autowired
    private NotificacaoRepository repository;

    public Notificacao salvar(Notificacao notificacao) {
        return repository.save(notificacao);
    }
}
