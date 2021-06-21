package es.iesrafaelalberti.daw.prog.examen;

import java.util.ArrayList;
import java.util.List;

public class Agregador {
    private List<Suscripcion> suscripciones;

    public Agregador() {
        this.suscripciones = new ArrayList<Suscripcion>();
    }

    public List<Suscripcion> enviaSuscripciones(){
        return suscripciones;
    }



}
