package com.example.videogames.controller;


import com.example.videogames.domain.Videojuego;
import com.example.videogames.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListadoController {

    private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService){
        this.videojuegoService=videojuegoService;
    }

    @RequestMapping("/")
    public String listarVideojuegos(Model model){
        List<Videojuego> destacados=videojuegoService.buscarDestacados();
       model.addAttribute("videojuegos", destacados);
        //busqueda de los videojuegos
       return"listado";
    }

}
