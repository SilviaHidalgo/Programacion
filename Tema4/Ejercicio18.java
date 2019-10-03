import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe un numero entero de máximo 5 cifras y te dire la primera cifra:");
    
      int numero = x.nextInt();
      int cifra;
      
    if(numero<10){
      
      cifra = numero;
      
      System.out.println("La primera cifra es " + cifra);
      
      }
      
    else{
      
      if(numero<100){
        
        cifra = (int)(numero*0.1);
        
        System.out.println("La primera cifra es " + cifra);
        
        }
      
      else{
        
        if(numero<1000){
          
          cifra = (int)(numero*0.01);
          
          System.out.println("La primera cifra es " + cifra);
          
          }
        
        else{
          
          if (numero<10000){
            
            cifra = (int)(numero*0.001);
            
            System.out.println("La primera cifra es " + cifra);
            
            }
          
          else{
            
            if (numero<100000){
              
              cifra = (int)(numero*0.0001);
              
              System.out.println("La primera cifra es " + cifra);
              
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
