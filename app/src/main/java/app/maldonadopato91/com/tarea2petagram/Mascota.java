package app.maldonadopato91.com.tarea2petagram;

/**
 * Created by User on 18/5/2016.
 */
public class Mascota {
    int fotoMascota;
    String nombreMasco;

    public Mascota(int fotoMascota, String nombreMasco) {
        this.fotoMascota = fotoMascota;
        this.nombreMasco = nombreMasco;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public String getNombreMasco() {
        return nombreMasco;
    }

    public void setNombreMasco(String nombreMasco) {
        this.nombreMasco = nombreMasco;
    }
}
