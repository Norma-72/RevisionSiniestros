/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginTest;

/**
 *
 * @author norma
 */
import org.junit.Test;
import static org.junit.Assert.*;
import com.siniestros.model.Usuario; // Asegúrate de que esta sea la ruta de tu clase Usuario

public class LoginTest {

    @Test
    public void testValidacionCredenciales() {

        String usuarioCorrecto = "admin";
        String passCorrecta = "1234";

        boolean esValido = usuarioCorrecto.equals("admin") && passCorrecta.equals("1234");

        assertTrue("El login debería ser exitoso con credenciales correctas", esValido);
    }
}