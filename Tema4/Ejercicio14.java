import java.util.Scanner;

public class Ejercicio14{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe un número y te dire si es par y/o divisible entre 5:");
    
    int numero = x.nextInt();
    
    if(numero%2==0){
      
      System.out.println("Es un numero par");
      
      if(numero%5==0){
        
        System.out.println("Y tambien es divisible entre 5");
        
        }
        
      else{
        
        System.out.println("Pero no es divisible entre 5");
        
        }
      
      }
    
    else {
      
      if(numero%5==0){
        
        System.out.println("Es solo divisible entre 5");
        
        }
        
      else{
        
        System.out.println("No es par ni divisible entre 5");
        
        }  
      
      }
    
    
    
    
    }
  }
