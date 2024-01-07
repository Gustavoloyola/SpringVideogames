package com.example.videogames.service;

import com.example.videogames.domain.Videojuego;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideojuegoService {
    public List<Videojuego> buscarDestacados(){
        List<Videojuego>destacados=new ArrayList<>();

        Videojuego juego = new Videojuego();
        juego.setNombre("GTA V");
        juego.setDescripcion("Grand Theft Auto V es un videojuego de acción-aventura de mundo abierto en tercera persona desarrollado por el estudio escocés Rockstar North y distribuido por Rockstar Games. Este título revolucionario hizo su debut el 17 de septiembre de 2013 en las consolas Xbox 360 y PlayStation 3.");
        juego.setImagenUrl("https://blog.latam.playstation.com/tachyon/sites/3/2022/03/69666b42e94316dcaff0307b4480e04ce31780be-scaled.jpg?resize=1088%2C612&crop_strategy=smart");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("The legend of zelda");
        juego.setDescripcion("The Legend of Zelda es una serie de videojuegos de acción-aventura creada por los diseñadores japoneses Shigeru Miyamoto y Takashi Tezuka, \u200B y desarrollada por Nintendo, empresa que también se encarga de su distribución internacional.");
        juego.setImagenUrl("https://media.es.wired.com/photos/64629c28a566376ee967bbcd/master/pass/Zelda.png");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Mortal Kombat");
        juego.setDescripcion("Mortal Kombat es una franquicia de videojuegos de lucha creada por Ed Boon y John Tobias en 1992. Las cuatro primeras entregas fueron distribuidas por Midway Games y lanzadas principalmente en máquinas arcade; posteriormente estuvieron disponibles en consolas domésticas.");
        juego.setImagenUrl("https://cdn1.epicgames.com/offer/fda0f2b4047f46ffb4e94d5595c1468e/EGS_MortalKombat1_NetherRealmStudios_S4_1200x1600-076e67292bb57f11ebb4465b7e74a65e");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("The last of us");
        juego.setDescripcion("Joel y Ellie, dos personas conectadas por la brutalidad del mundo en el que viven, se ven obligados a enfrentarse a criaturas y asesinos despiadados, mientras viajan a través de un Estados Unidos posapocalíptico.");
        juego.setImagenUrl("https://i.ytimg.com/vi/AaOWRvmtEFQ/maxresdefault.jpg");
        destacados.add(juego);

return destacados;
    }

}
