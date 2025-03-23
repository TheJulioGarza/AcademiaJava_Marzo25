public class Gamer {

    private String nombre;
    private Videojuego videojuego;

    public Gamer(String nombre, Videojuego videojuego){
        this.nombre = nombre;
        this.videojuego =  videojuego;
    }

    public void jugar(){
        System.out.println("Usuario " + nombre + " está jugando en " + videojuego.getClass().getSimpleName());
        videojuego.ejecutar();
    }

}
