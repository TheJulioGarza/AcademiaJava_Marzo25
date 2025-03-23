public abstract class Catalogo implements Precio, Calidad {

    String title;
    int year;
    String director;
    float rating;

    public Catalogo(String title, int year, String director, float rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public abstract void mensajeReproduccion();

    public void MostrarInfo(){
        System.out.println("Titulo: " + this.title +
                "\nAño de estreno: " + this.year +
                "\nDirector: " + this.director +
                "\nRating IMDb: " + this.rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
