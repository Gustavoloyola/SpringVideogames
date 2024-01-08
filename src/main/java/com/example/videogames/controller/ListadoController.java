package com.example.videogames.controller;


import com.example.videogames.domain.Videojuego;
import com.example.videogames.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/videojuegosPorDistribuidor")
    public String listaVideojuegosPorDistribuidor(int distribuidorId, Model model){
        List<Videojuego> juegos=videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos",juegos);
        return "listado";

    }

    @RequestMapping("/buscar")
    public String buscar (@RequestParam("q") String consulta, Model model) {
        List<Videojuego> juegos = videojuegoService.buscar(consulta);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }

}
