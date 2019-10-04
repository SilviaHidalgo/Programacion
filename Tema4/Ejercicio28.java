import java.util.Scanner;

public class Ejercicio28{
  public static void main(String[] args){
  
    Scanner x = new Scanner(System.in);
  
    System.out.print("Jugador 1 introduzca piedra, papel o tijeras: ");
  
    String uno = x.next();
  
    System.out.print("Jugador 2 introduzca piedra, papel o tijeras: ");
  
    String dos = x.next();
  
    if(uno.equals(dos)){
    
      System.out.println("¡¡EMPATE!!");
    
    }
    
    else{
      
      if (uno.equals("piedra") && dos.equals("papel")){
        
        System.out.println("¡¡El ganador es el jugador 2!!");
        
      }
      
      else{
      
        if (uno.equals("piedra") && dos.equals("tijeras")){
        
          System.out.println("¡¡El ganador es el jugador 1!!");
        
        }
      
        else{
      
          if (uno.equals("tijeras") && dos.equals("piedra")){
        
            System.out.println("¡¡El ganador es el jugador 2!!");
        
          }
          
          else{
      
            if (uno.equals("tijeras") && dos.equals("papel")){
        
              System.out.println("¡¡El ganador es el jugador 1!!");
        
            }
            
            else{
      
              if (uno.equals("papel") && dos.equals("tijeras")){
        
                System.out.println("¡¡El ganador es el jugador 2!!");
        
              }
              
              else{
      
                if (uno.equals("papel") && dos.equals("piedra")){
        
                  System.out.println("¡¡El ganador es el jugador 1!!");
        
                }
              } 
            } 
          } 
        }
      }
    }
  }
}
