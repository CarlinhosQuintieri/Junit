package com.mycompany.junit;

public class ex3 {
    
    public String classificador3(int idade){
         
          String classif ="";
          if(idade<=50){
              classif ="renovação a cada 10 anos";
          }
          else if(idade>=50  || idade<=70){
              classif ="renovação a cada 5 anos";
          }
          else if(idade<=70){
              classif ="renovação a cada 3 anos";
          }
          return classif;
      }
    
    

}