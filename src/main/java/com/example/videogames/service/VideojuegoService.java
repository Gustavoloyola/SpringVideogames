package com.example.videogames.service;

import com.example.videogames.domain.Videojuego;
import com.example.videogames.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideojuegoService {

    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository= videojuegoRepository;
    }

    public List<Videojuego> buscarDestacados(){

return videojuegoRepository.buscarTodos();
    }

    public List<Videojuego> buscarPorDistribuidor(int distribuidorId){
        return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }

    public List<Videojuego>buscar(String consulta){
        return videojuegoRepository.buscar(consulta);
    }

}
