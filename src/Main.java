import Clases.Cancion;
import Clases.Persona;
import Clases.Serie;
import Clases.Videojuego;

public class Main{
    public static void main(String[] args) {
        //Objetos de la clase cancion
        System.out.println("\nObjetos de la clase cancion");
        Cancion cancion=new Cancion();
        cancion.nombre="Chicago";
        cancion.genero="Pop";
        cancion.imprimir();
        Cancion cancion2=new Cancion();
        cancion2.nombre="Lose YourSelft";
        cancion2.genero="Rap";
        cancion2.imprimir();
        //Objetos de la clase serie
        System.out.println("\nObjetos de la clase serie");
        Serie serie=new Serie();
        serie.nombre="Breaking Bad";
        serie.temporadas=5;
        serie.imprimir();
        Serie serie2=new Serie();
        serie2.nombre="Dr.House";
        serie2.temporadas=9;
        serie2.imprimir();
        //Objetos de la clase Videojuego
        System.out.println("\nObjetos de la clase Videojuego");
        Videojuego videojuego=new Videojuego();
        videojuego.anio=2024;
        videojuego.plataforma="Computadora";
        videojuego.imprimir();
        Videojuego videojuego2=new Videojuego();
        videojuego2.anio=2018;
        videojuego2.plataforma="PlayStation";
        videojuego2.imprimir();
        //Objetos de la clase Persona
        System.out.println("\nObjetos de la clase Persona");
        Persona persona=new Persona();
        persona.edad=19;
        persona.estatura= 1.74F;
        persona.imprimir();
        Persona persona2=new Persona();
        persona2.edad=15;
        persona2.estatura= 1.65F;
        persona2.imprimir();
        //Objeto de la clase auto
        System.out.println("\nObjetos de la clase Auto");
        Auto auto=new Auto();
        auto.color="Azul";
        auto.marca="Mercedez";
        auto.imprimir();
        Auto auto2=new Auto();
        auto2.color="Rojo";
        auto2.marca="Chevrolet";
        auto2.imprimir();
        //Objetos de la clase transporte
        System.out.println("\nObjetos de la clase Transporte");
        Transporte transporte=new Transporte();
        transporte.tipo="Acuatico";
        transporte.capacidad=4;
        transporte.imprimir();
        Transporte transporte2=new Transporte();
        transporte2.tipo="Aereo";
        transporte2.capacidad=120;;
        transporte2.imprimir();
        // Objetos de la clase Materia
        System.out.println("\nObjetos de la clase Materia");
        Materia materia=new Materia();
        materia.nombre="Estadistica";
        materia.creditos=3;
        materia.imprimir();
        Materia materia2=new Materia();
        materia2.nombre="Comunicacion";
        materia2.creditos=1;
        materia2.imprimir();
        //Objetos de la clase Zapato
        System.out.println("\nObjetos de la clase Zapato");
        Zapato zapato=new Zapato();
        zapato.marca="Nike";
        zapato.talla=39;
        zapato.imprimir();
        Zapato zapato2=new Zapato();
        zapato2.marca="Puma";
        zapato2.talla=42;
        zapato2.imprimir();
        //Objetos de la clase InstrumentoMusical
        System.out.println("\nObjetos de la clase InstrumentoMusical");
        InstrumentoMusical instrumentoMusical=new InstrumentoMusical();
        instrumentoMusical.nombre="Violin";
        instrumentoMusical.tipo="Cuerda";
        instrumentoMusical.imprimir();
        InstrumentoMusical instrumentoMusical2=new InstrumentoMusical();
        instrumentoMusical2.nombre="Trompeta";
        instrumentoMusical2.tipo="Aire";
        instrumentoMusical2.imprimir();
        // Objetos de la clase Pelicula
        System.out.println("\nObjetos de la clase Pelicula");
        Pelicula pelicula = new Pelicula();
        pelicula.titulo = "Uncharted";
        pelicula.director = "Ruben Fleischer";
        pelicula.imprimir();
        Pelicula pelicula2 = new Pelicula();
        pelicula2.titulo = "Tick tick boom";
        pelicula2.director = "Lin-Manuel Miranda";
        pelicula2.imprimir();

    }
}

