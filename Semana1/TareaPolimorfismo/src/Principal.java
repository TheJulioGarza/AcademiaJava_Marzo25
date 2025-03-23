public class Principal {

    public static void main(String[] args) {
        Catalogo netflix = new Netflix("Squid Games", 2021, "Hwang Dong-hyuk", 8.0f);
        Catalogo amazon = new Amazon("Fallout", 2024, "Graham Wagner",8.3f);
        Catalogo disney = new Disney("Loki", 2021, "Michael Waldron",8.2f);

        System.out.println("Catálogo de Series y Peliculas");
        System.out.println("=================================");
        netflix.mensajeReproduccion();
        netflix.mostrarPrecio();
        netflix.MostrarInfo();
        netflix.mostrarCalidad();
        System.out.println("=================================");

        amazon.mensajeReproduccion();
        amazon.mostrarPrecio();
        amazon.MostrarInfo();
        amazon.mostrarCalidad();
        System.out.println("=================================");
        disney.mensajeReproduccion();
        disney.mostrarPrecio();
        disney.MostrarInfo();
        disney.mostrarCalidad();
        System.out.println("=================================");


    }

}
