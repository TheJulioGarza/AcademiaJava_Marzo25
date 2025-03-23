public class Nintendo implements Videojuego{

    private String juego;

    public Nintendo(String juego){
        this.juego = juego;
    }

    @Override
    public void ejecutar() {
        System.out.println("NINTENDO - Corriendo juego " + juego);
    }

}
