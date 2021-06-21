package Test;

import es.iesrafaelalberti.daw.prog.examen.Noticia;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class NoticiaTest {
    Noticia noticia;
    @BeforeEach
    void setUp() {
        noticia = new Noticia(Calendar.getInstance(),"Nueva Noticia");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void publicaTest(){
        System.out.println(noticia.publicar());
    }
}