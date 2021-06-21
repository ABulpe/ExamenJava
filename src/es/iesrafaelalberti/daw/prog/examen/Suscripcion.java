package es.iesrafaelalberti.daw.prog.examen;

import java.util.Calendar;

public interface Suscripcion{

    boolean activa(Calendar calendar);
    Usuario getUsuario();
    void setUsuario();

}
