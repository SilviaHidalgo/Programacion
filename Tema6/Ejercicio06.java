import java.util.Scanner;

public class Ejercicio06{
  public static void main (String[] args){
  
    Scanner x = new Scanner(System.in);
    
    int introducido;
    int num;
    int intentos = 5;
    boolean salir = true;
    
    num =(int)(Math.random()*100)+1;
    
    do{
      
      System.out.println("");
    
      System.out.print("Adivina el número entre 0-100 tienes "+intentos+" intentos: ");
      
      introducido = x.nextInt();
      
      if (num==introducido){
        
        System.out.println("");
      
        System.out.print("¡Enhorabuena has adivinado el número!");
        
        intentos = 0;
      
      }
      
      else{
        
        if(introducido>num){
          
          System.out.println("");
        
          System.out.println("El número introducido es menor que el número a adivinar");
          
          intentos--;
          
        }
        
        else{
          
          System.out.println("");
        
          System.out.println("El número introducido es mayor que el número a adivinar");
          
          intentos--;
        
        }
      
      }
      
    
    }while(intentos>0);
    
    
  
  }
}
