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
public class ex3Test {
    
    public ex3Test() {
    }
     ex3 idade =new ex3();
    @Test

     public void testSub50() {
      assertEquals("renovação a cada 10 anos",idade.classificador3(40));
      assertEquals("renovação a cada 10 anos",idade.classificador3(49));
     }
      public void testSub70() {
      assertEquals("renovação a cada 5 anos",idade.classificador3(60));
      assertEquals("renovação a cada 5 anos",idade.classificador3(50));
      assertEquals("renovação a cada 5 anos",idade.classificador3(51));
      assertEquals("renovação a cada 5 anos",idade.classificador3(69));
     }
     public void test70ouMais() {
      assertEquals("renovação a cada 3 anos",idade.classificador3(77));
      assertEquals("renovação a cada 3 anos",idade.classificador3(71));
      assertEquals("renovação a cada 3 anos",idade.classificador3(70));
     }
      
    
    
}