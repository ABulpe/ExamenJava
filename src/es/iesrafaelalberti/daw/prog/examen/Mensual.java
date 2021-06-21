package es.iesrafaelalberti.daw.prog.examen;

import java.util.Calendar;

public class Mensual implements Suscripcion{

    private int duracion;
    private int dia;
    private Usuario usuario;

    public Mensual(int duracion, int dia, Usuario usuario) {
        this.duracion = duracion;
        this.dia = dia;
        this.usuario = usuario;
    }

    @Override
    public boolean activa(Calendar fecha) {
        int dia_fecha = fecha.get(Calendar.DAY_OF_MONTH);
        return this.dia == dia_fecha;
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
