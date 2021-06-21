package es.iesrafaelalberti.daw.prog.examen;

import java.util.Calendar;

public class Semanal implements Suscripcion{

    private  Calendar caducidad;
    private int dia;
    private Usuario usuario;

    public Semanal(Calendar caducidad, int día, Usuario usuario) {
        this.caducidad = caducidad;
        this.dia = día;
        this.usuario = usuario;
    }

    @Override
    public boolean activa(Calendar fecha) {

        int dia_fecha = fecha.get(Calendar.DAY_OF_MONTH);
        return fecha.getTime().before(caducidad.getTime()) && dia_fecha == dia;

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
