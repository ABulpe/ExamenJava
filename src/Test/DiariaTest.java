package Test;

import es.iesrafaelalberti.daw.prog.examen.Diaria;
import es.iesrafaelalberti.daw.prog.examen.Usuario;
import org.junit.jupiter.api.Test;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class DiariaTest {
    Usuario usuario;
    Diaria suscripcion;
    Calendar fecha;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         fecha = Calendar.getInstance();
         fecha.set(1994,11,20);
         usuario = new Usuario("Alberto","Kelsier94","bulpe93@gmail.com");
         suscripcion = new Diaria(Calendar.getInstance(),usuario);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void activaTest(){

        assert suscripcion.activa(fecha ) == false;
    }

}