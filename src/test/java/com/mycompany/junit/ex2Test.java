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
public class ex2Test {
    
    public ex2Test() {
    }

    ex2 nota =new ex2();
    @Test
    public void testInvalido() {
      assertEquals("nota inválida",nota.classificador2(-1));
      assertEquals("nota inválida",nota.classificador2(11));
      
      
    }
     public void testValido() {
      assertEquals("nota valida",nota.classificador2(5));
      assertEquals("nota valida",nota.classificador2(0));
      assertEquals("nota valida",nota.classificador2(1));
      assertEquals("nota valida",nota.classificador2(9));
      assertEquals("nota valida",nota.classificador2(10));
    }
    
}