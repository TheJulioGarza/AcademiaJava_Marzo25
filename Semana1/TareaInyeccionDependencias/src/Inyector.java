public class Inyector {

    public static Gamer getVideojuego(String nombre, String consola) {
        Videojuego nintendo = new Nintendo("The Legend of Zelda");
        Videojuego xbox = new Xbox("Halo Reach");
        Videojuego steam = new Steam("GTA V");

        if (consola.equals("Nintendo")) {
            return new Gamer(nombre,nintendo);
        } else if (consola.equals("Xbox")) {
            return new Gamer(nombre,xbox);
        } else if (consola.equals("Steam")) {
            return new Gamer(nombre,steam);
        }else{
            throw new IllegalArgumentException("Tipo de videojuego no soportado: " + consola);
        }

    }
}
