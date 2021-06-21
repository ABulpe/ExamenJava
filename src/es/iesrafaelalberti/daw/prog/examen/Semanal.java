package es.iesrafaelalberti.daw.prog.examen;

import java.util.Calendar;

public class Semanal implements Suscripcion{

    private  Calendar caducidad;
    private int día;
    private Usuario usuario;

    public Semanal(Calendar caducidad, int día, Usuario usuario) {
        this.caducidad = caducidad;
        this.día = día;
        this.usuario = usuario;
    }

    @Override
    public boolean activa(Calendar calendar) {
        return false;
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
