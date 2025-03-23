public class Xbox implements Videojuego{

    private String juego;

    public Xbox(String juego){
        this.juego = juego;
    }

    @Override
    public void ejecutar() {
        System.out.println("Xbox - Corriendo juego " + juego);
    }

}
