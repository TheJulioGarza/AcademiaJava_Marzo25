public class Amazon extends Catalogo {

    public Amazon(String title, int year, String director, float rating){
        super(title, year, director,rating);
    }

    @Override
    public void mensajeReproduccion() {
        System.out.println("Reproduciendo desde la plataforma Amazon Prime Video !");
    }

    @Override
    public void mostrarCalidad() {
        System.out.println("SD,HD");
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("El precio de la suscripcion es de MXN$100.");

    }




}
