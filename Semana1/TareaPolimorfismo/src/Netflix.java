public class Netflix extends Catalogo {

    public Netflix(String title, int year, String director, float rating){
        super(title, year, director,rating);
    }

    @Override
    public void mensajeReproduccion() {
        System.out.println("Reproduciendo desde la plataforma Netflix !");
    }


    @Override
    public void mostrarPrecio() {
        System.out.println("El precio de la suscripcion es de MXN$250.");

    }

    @Override
    public void mostrarCalidad() {
        System.out.println("SD,HD,2K,4K");
    }
}
