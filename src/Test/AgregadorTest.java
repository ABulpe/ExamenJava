package Test;

import es.iesrafaelalberti.daw.prog.examen.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class AgregadorTest {

    Agregador agregador;
    Noticia noticia1;
    Noticia noticia2;
    Diaria suscripcion1;
    Semanal suscripcion2;
    Usuario usuario;
    @BeforeEach
    void setUp() {
        noticia1 = new Noticia(Calendar.getInstance(),"Noticia 1");
        noticia2 = new Noticia(Calendar.getInstance(),"Noticia 2");
        usuario = new Usuario("Alberto","Kelsier94","bulpe93@gmail.com");
        suscripcion1 = new Diaria(Calendar.getInstance(),usuario);
        suscripcion2 = new Semanal(Calendar.getInstance(),20,usuario);

    }

    @AfterEach
    void tearDown() {
    }


}