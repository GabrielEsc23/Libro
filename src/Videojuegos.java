public class Videojuegos {
    public class Videojuego {
        // Atributos
        String titulo;
        String desarrollador;
        String genero;
        int duracion; // Duración en horas

        // Constructor
        public Videojuego(String titulo, String desarrollador, String genero, int duracion) {
            this.titulo = titulo;
            this.desarrollador = desarrollador;
            this.genero = genero;
            this.duracion = duracion;
        }

        public void imprimir() {
            System.out.println("El título es: " + this.titulo);
            System.out.println("El desarrollador es: " + this.desarrollador);
            System.out.println("El género es: " + this.genero);
            System.out.println("La duración es: " + this.duracion + " horas");
            System.out.println("---------------");
        }

        public int duracionConExpansiones() {
            return this.duracion + 5; // Añade 5 horas por expansiones
        }
        //geters
        public String genero() {
            return this.genero;

        }
        public String desarrollador() {
            return this.desarrollador;
        }
        public String titulo() {
            return this.titulo;
        }
    }

} //fsafsdfsdfsdfsdfsdfsdfsdfsdf
