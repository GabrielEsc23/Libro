public class Peliculas {
    public class Pelicula {
        // Atributos
        String titulo;
        String director;
        String genero;
        int duracion; // Duración en minutos

        // Constructor
        public Pelicula(String titulo, String director, String genero, int duracion) {
            this.titulo = titulo;
            this.director = director;
            this.genero = genero;
            this.duracion = duracion;
        }

        public void imprimir() {
            System.out.println("El título es: " + this.titulo);
            System.out.println("El director es: " + this.director);
            System.out.println("El género es: " + this.genero);
            System.out.println("La duración es: " + this.duracion + " minutos");
            System.out.println("---------------");
        }

        public int duracionConAnuncios() {
            return this.duracion + 10; // Añade 10 minutos por anuncios
        }
    }

}
