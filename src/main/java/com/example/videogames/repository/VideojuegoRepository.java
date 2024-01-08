package com.example.videogames.repository;

import com.example.videogames.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{


    //opcion en sql
    // @Query("select * from videojuego by order by nombre",nativeQuery=true)
    @Query("select v from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();
@Query("from Videojuego v where v.distribuidor.id= ?1 order by v.nombre")
    List <Videojuego> buscarPorDistribuidor(int distribuidorId);
@Query ("from Videojuego v where v.nombre like %?1%")
List<Videojuego> buscar(String consulta);

//List<Videojuego> findByNombreContaining (String consulta); sin @query

}
