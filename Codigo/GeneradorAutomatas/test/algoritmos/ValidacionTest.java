/*
 * Trabajo Práctico de Compiladores 2008.
 * 10mo Semestre Ingeniería Infomática.
 * Facultad Politécnica - UNA.
 */
package algoritmos;

import analisis.Alfabeto;
import analisis.AnalizadorSintactico;
import estructuras.AFD;
import estructuras.AFN;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de prueba para la clase <code>Validacion</code>.
 * @author Germán Hüttemann
 * @author Marcelo Rodas
 */
public class ValidacionTest {

    /**
     * Test of validarAFN method, of class Validacion.
     */
    @Test
    public void testValidarAFN() {
        assertTrue(true);
    }

    /**
     * Test of validarAFD method, of class Validacion.
     * @throws Exception En caso de fallar el análisis sintáctico.
     */
    @Test
    public void testValidarAFD() throws Exception {
        Alfabeto alfa = new Alfabeto("ab");
        String er = "(a|b)*abb";
        String entrada = "abb";
        
        AnalizadorSintactico as = new AnalizadorSintactico(alfa, er);
        AFN afn = as.analizar();
        AFD afd = Subconjuntos.getAFD(afn);
        
        System.out.printf("Entrada: %s\n", entrada);
        System.out.printf("AFD:\n%s", afd);
        
        ResultadoValidacion rv = Validacion.validarAFD(afd, entrada);       
        System.out.printf("\nCamino: ");
        System.out.printf("%s ", rv.getCamino());
        
        System.out.printf("\nFaltante: '%s'\n", rv.getEntradaFaltante());
                
        assertTrue(rv.esValido());
    }
}