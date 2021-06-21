package es.iesrafaelalberti.daw.prog.examen;

import java.util.Calendar;
import java.util.Date;

public class Diaria implements Suscripcion{

    private Calendar caducidad;
    private Usuario usuario;

    public Diaria(Calendar caducidad, Usuario usuario) {
        this.caducidad = caducidad;
        this.usuario = usuario;
    }

    @Override
    public boolean activa(Calendar fecha) {

        return fecha.getTime().before(caducidad.getTime());


    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario() {
        this.usuario = usuario;

    }


}
