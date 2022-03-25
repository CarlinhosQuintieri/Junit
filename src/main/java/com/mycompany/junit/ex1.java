package com.mycompany.junit;

public class ex1 {
      public String classificador(int ano){
         
          String classif ="";
          if(ano<1900 || ano>2020){
              classif ="Ano inválido";
          }
          else if(ano>=1900 || ano<=2020){
              classif ="Ano Valido";
          }
          return classif;
      }
    
    

}
