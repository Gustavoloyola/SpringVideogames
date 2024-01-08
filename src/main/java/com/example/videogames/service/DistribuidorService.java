package com.example.videogames.service;

import com.example.videogames.domain.Distribuidor;
import com.example.videogames.repository.DistribuidorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistribuidorService {

    private final DistribuidorRepository distribuidorRepository;

    public DistribuidorService(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }

    public List<Distribuidor> buscarTodos(){
        return distribuidorRepository.findAll();

    }
}
