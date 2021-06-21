package es.iesrafaelalberti.daw.prog.examen;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Agregador {

    private List<Noticia> noticias;
    private List<Suscripcion> suscripciones;

    public Agregador() {
        this.noticias = new ArrayList<Noticia>();
        this.suscripciones = new ArrayList<Suscripcion>();
    }

    public void añadeNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void eliminaNoticia(Noticia noticia) {
        noticias.remove(noticia);
    }

    public void añadeSuscripcion(Suscripcion suscripcion) {
        suscripciones.add(suscripcion);
    }

    public void eliminaSuscripcion(Suscripcion suscripcion) {
        suscripciones.remove(suscripcion);
    }

    public void enviarSuscripciones() {
        Calendar fecha = Calendar.getInstance();
        for(Suscripcion suscripcion: suscripciones) {
            if (suscripcion.activa(fecha)) {
                System.out.println(suscripcion.getUsuario().getEmail());
            }
        }
    }

    public List<Noticia> noticias(Calendar fecha1, Calendar fecha2) {
        List<Noticia> noticias;
        noticias = new ArrayList<Noticia>();
        for (Noticia noticia: noticias) {
            if (noticia.getFecha().compareTo(fecha1) >= 0 && noticia.getFecha().compareTo(fecha2) <= 0) {
                noticias.add(noticia);
            }
        }
        return noticias ;
    }

}