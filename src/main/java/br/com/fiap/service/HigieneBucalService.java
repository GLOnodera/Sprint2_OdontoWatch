package br.com.fiap.service;

import br.com.fiap.model.HigieneBucal;
import br.com.fiap.repository.HigieneBucalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HigieneBucalService {

    @Autowired
    private HigieneBucalRepository repository;

    public HigieneBucal salvar(HigieneBucal higieneBucal) {
        return repository.save(higieneBucal);
    }
}
