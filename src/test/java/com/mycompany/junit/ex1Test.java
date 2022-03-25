/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vitor
 */
public class ex1Test {
    
    public ex1Test() {
    }
    ex1 ano =new ex1();
    @Test
    public void testInvalido() {
      assertEquals("Ano inválido",ano.classificador(1890));
      assertEquals("Ano inválido",ano.classificador(2023));
      assertEquals("Ano inválido",ano.classificador(2021));
      assertEquals("Ano inválido",ano.classificador(1899));
    }
    
}
