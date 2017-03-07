import org.junit.Test;
import static org.junit.Assert.assertEquals;



/**
 * Unit test for simple App.
 */
public class ReaderTest {


    /*
    *El programa solo funciona para lenguajes
    * en los que los comentarios no son con comillas
    * o simbolo de gato
    */
    @Test
    public void validFileType() {
        FileValidator fv = new FileValidator();
        assertEquals("Archivo no válido",true,fv.checkFileType("/Users/jacobotapia/Desktop/COJ1140.java"));
        assertEquals("Archivo no válido",true,fv.checkFileType("/Users/jacobotapia/Desktop/code.cpp"));
        assertEquals("Archivo no válido",false,fv.checkFileType("/Users/jacobotapia/Desktop/some.py"));
        assertEquals("Archivo no válido",false,fv.checkFileType("/Users/jacobotapia/Desktop/falsaAlarma.txt"));
        assertEquals("Archivo no válido",false,fv.checkFileType("/Users/jacobotapia/Desktop/avion.rb"));
    }

    @Test
    public void numeroLineas(){
        CodeReader cr = new CodeReader();
        StringBuilder sb = new StringBuilder();
        assertEquals("Está mal tu contador",13,cr.countLines("/Users/jacobotapia/Desktop/code.cpp"));
        assertEquals("Está mal tu contador",151,cr.countLines("/Users/jacobotapia/Desktop/COJ1140.java"));
        assertEquals("Está mal tu contador",-1,cr.countLines("/Users/jacobotapia/Desktop/avion.rb"));
        assertEquals("Está mal tu contador",-1,cr.countLines("/Users/jacobotapia/Desktop/some.py"));
        assertEquals("Está mal tu contador",-1,cr.countLines("/Users/jacobotapia/Desktop/falso.txt"));
    }


}

