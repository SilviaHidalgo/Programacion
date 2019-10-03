import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe un numero y te dire el numero de cifras:");
    
      int numero = x.nextInt();
      numero = Math.abs(numero);
      
    if(numero<10){
      
      System.out.println("Tiene 1 cifra");
      
      }
      
    else{
      
      if(numero<100){
          
        System.out.println("Tiene 2 cifras");
        
        }
      
      else{
        
        if(numero<1000){
          
          System.out.println("Tiene 3 cifras");
          
          }
        
        else{
          
          if (numero<10000){
            
            System.out.println("Tiene 4 cifras");
            
            }
          
          else{
            
            if (numero<100000){
              
              System.out.println("Tiene 5 cifras");
              
              }
              
            else {
              
              System.out.println("Es un numero superior a 5 cifras");
              
              }  
            }
          }
        }
      }
    }
  }
