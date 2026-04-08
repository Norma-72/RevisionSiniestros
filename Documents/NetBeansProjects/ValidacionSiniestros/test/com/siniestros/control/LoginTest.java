/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.siniestros.control;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
    
    public boolean validarCredenciales(String usuario, String password) {
        return "Norma".equals(usuario) && "Seguros2026".equals(password);
    }

    @Test
    public void testLoginExitoso() {
        System.out.println("Ejecutando prueba: Login Exitoso");
        boolean resultado = validarCredenciales("Norma", "Seguros2026");
        assertTrue("El login debería permitir el acceso con datos correctos", resultado);
    }

    @Test
    public void testLoginFallido() {
        System.out.println("Ejecutando prueba: Login Fallido");
        boolean resultado = validarCredenciales("UsuarioErroneo", "12345");
        assertFalse("El login debería rechazar el acceso con datos incorrectos", resultado);
    }
}
