public class Steam implements Videojuego{

    private String juego;

    public Steam(String juego){
        this.juego = juego;
    }

    @Override
    public void ejecutar() {
        System.out.println("Steam - Corriendo juego " + juego);
    }
}
