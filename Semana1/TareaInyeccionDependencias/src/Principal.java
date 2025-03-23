public class Principal {

    public static void main(String[] args) {

        Gamer gamer1 = Inyector.getVideojuego("Julio","Nintendo");
        Gamer gamer2 = Inyector.getVideojuego("Ana","Xbox");
        Gamer gamer3 = Inyector.getVideojuego("Alan","Steam");
        //Gamer gamer4 = Inyector.getVideojuego("Mario","PlayStation"); //Exception

        System.out.println("Renta de videojuego");
        System.out.println("==============================");

        gamer1.jugar();
        System.out.println("==============================");

        gamer2.jugar();
        System.out.println("==============================");

        gamer3.jugar();
        System.out.println("==============================");

    }

}
