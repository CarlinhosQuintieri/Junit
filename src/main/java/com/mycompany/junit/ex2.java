package com.mycompany.junit;

public class ex2 {

    public String classificador2(int nota){
         
          String classif ="";
          if(nota<0 || nota>10){
              classif ="nota inválida";
          }
          else if(nota>=0 || nota<=10){
              classif ="nota valida";
          }
          return classif;
      }
    
    

}
