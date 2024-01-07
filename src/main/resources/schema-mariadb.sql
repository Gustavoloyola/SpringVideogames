drop table if exists videojuego;
drop table if exists distribuidor;

CREATE TABLE videojuego(
id int PRIMARY KEY auto_increment,
nombre varchar (100) NOT NULL,
descripcion varchar (3000),
imagen_url varchar(500)


);

INSERT into videojuego
(id,nombre, descripcion,imagen_url)
VALUES



      ( 1,"GTA V", "Grand Theft Auto V es un videojuego de acción-aventura de mundo abierto en tercera persona desarrollado por el estudio escocés Rockstar North y distribuido por Rockstar Games. Este título revolucionario hizo su debut el 17 de septiembre de 2013 en las consolas Xbox 360 y PlayStation 3."
      ,"https://blog.latam.playstation.com/tachyon/sites/3/2022/03/69666b42e94316dcaff0307b4480e04ce31780be-scaled.jpg?resize=1088%2C612&crop_strategy=smart"),



     (2,"The legend of zelda",
        "The Legend of Zelda es una serie de videojuegos de acción-aventura creada por los diseñadores japoneses Shigeru Miyamoto y Takashi Tezuka, \u200B y desarrollada por Nintendo, empresa que también se encarga de su distribución internacional.",
        "https://media.es.wired.com/photos/64629c28a566376ee967bbcd/master/pass/Zelda.png"),



       (3,"Mortal Kombat",
     "Mortal Kombat es una franquicia de videojuegos de lucha creada por Ed Boon y John Tobias en 1992. Las cuatro primeras entregas fueron distribuidas por Midway Games y lanzadas principalmente en máquinas arcade; posteriormente estuvieron disponibles en consolas domésticas.",
        "https://cdn1.epicgames.com/offer/fda0f2b4047f46ffb4e94d5595c1468e/EGS_MortalKombat1_NetherRealmStudios_S4_1200x1600-076e67292bb57f11ebb4465b7e74a65e"),

(4,"FC 24",
 "EA Sports FC 24 es un videojuego de fútbol, desarrollado por EA, y publicado por EA Sports. Este juego marca la primera entrega de la serie EA Sports FC, ​ tras la conclusión de la asociación de EA con FIFA.",
                 "https://pic.clubic.com/v1/images/2147200/raw?fit=max&width=1200&hash=e2e4961fbb7ea47109686cae36f218e20c4d2896"),


       (5,"The last of us",
        "Joel y Ellie, dos personas conectadas por la brutalidad del mundo en el que viven, se ven obligados a enfrentarse a criaturas y asesinos despiadados, mientras viajan a través de un Estados Unidos posapocalíptico.",
        "https://i.ytimg.com/vi/AaOWRvmtEFQ/maxresdefault.jpg"),

        (6,"Call of duty",
                "Call of Duty: Modern Warfare III es un videojuego de disparos en primera persona desarrollado por Infinity Ward y Sledgehammer Games y publicado por Activision, lanzándose para PlayStation 4, PlayStation 5, Xbox One, Xbox Series X|S y Microsoft Windows.",
                "https://www.callofduty.com/content/dam/atvi/callofduty/cod-touchui/blog/hero/mwiii/MWIII-REVEAL-FULL-TOUT.jpg"),

        (7,"Super Smash Bros Ultimate",
                "Super Smash Bros. Ultimate es un videojuego de lucha desarrollado por Sora Ltd. y Bandai Namco Entertainment y distribuido por Nintendo para la consola Nintendo Switch. Fue lanzado a nivel mundial el 7 de diciembre de 2018 y se trata del quinto título de la serie Super Smash Bros.",
                "https://assets.nintendo.com/image/upload/c_fill,w_1200/q_auto:best/f_auto/dpr_2.0/ncom/software/switch/70010000012332/ac4d1fc9824876ce756406f0525d50c57ded4b2a666f6dfe40a6ac5c3563fad9"),

        (8,"Spiderman 2",
                "Marvel's Spider-Man 2 es un videojuego de acción y aventuras desarrollado por Insomniac Games​​​ y publicado por Sony Interactive Entertainment.​​ Basado en el personaje de Marvel Comics",
                "https://image.api.playstation.com/vulcan/ap/rnd/202306/1219/1c7b75d8ed9271516546560d219ad0b22ee0a263b4537bd8.png");



create table distribuidor(
id int primary key auto_increment,
nombre varchar (200) not null,
sitio_web varchar(500)
);

insert into distribuidor
(id, nombre, sitio_web) values
(1, "2k", "https://www.2k.com/en-US/"),
(2, "Rockstargames", "https://www.rockstargames.com/mx"),
(3, "EA", "https://www.ea.com/es-mx"),
(4, "Capcom", NULL),
(5, "Konami", null),
(6, "Atari", null),
(7, "Activision", null);

ALTER TABLE videojuego
add column distribuidor_id int,
add foreign key (distribuidor_id) references distribuidor(id);

update videojuego set distribuidor_id=1 where id in (1,2);
update videojuego set distribuidor_id=2 where id in (3);
update videojuego set distribuidor_id=3 where id in (4);
update videojuego set distribuidor_id=4 where id in (5);
update videojuego set distribuidor_id=5 where id in (6);
update videojuego set distribuidor_id=6 where id in (7);
update videojuego set distribuidor_id=7 where id in (8);

alter table videojuego
modify distribuidor_id int not null;












