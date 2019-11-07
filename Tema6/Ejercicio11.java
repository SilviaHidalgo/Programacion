public class Ejercicio11{
  public static void main(String[] args){
    
    int num = 0;
    int contSuspenso = 0;
    int contSuficiente = 0;
    int contBien = 0;
    int contNotable = 0;
    int contSobresaliente = 0;
    
  
    for (int i=0; i<20; i++){
      
      num = (int)(Math.random()*10)+1;
        
        switch (num){
          
          case 0: 
          System.out.println (num+" Suspenso");
          contSuspenso++;
          break;
          
          case 1: 
          System.out.println (num+" Suspenso");
          contSuspenso++;
          break;
          
          case 2: 
          System.out.println (num+" Suspenso");
          contSuspenso++;
          break;
          
          case 3: 
          System.out.println (num+" Suspenso");
          contSuspenso++;
          break;
          
          case 4: 
          System.out.println (num+" Suspenso");
          contSuspenso++;
          break;
          
          case 5: 
          System.out.println (num+" Suficiente");
          contSuficiente++;
          break;
          
          case 6: 
          System.out.println (num+" Bien");
          contBien++;
          break;
          
          case 7: 
          System.out.println (num+" Notable");
          contNotable++;
          break;
          
          case 8: 
          System.out.println (num+" Notable");
          contNotable++;
          break;
          
          case 9: 
          System.out.println (num+" Sobresaliente");
          contSobresaliente++;
          break;
          
          case 10: 
          System.out.println (num+" Sobresaliente");
          contSobresaliente++;
          break;
        
        
        }
      
    }
      
    System.out.println("Hay "+contSuspenso+" suspensos, "+contSuficiente+" suficientes, "+contBien+" bienes, "+contNotable+" notables y "+contSobresaliente+" sobresalientes.");
    
  
  }
}
