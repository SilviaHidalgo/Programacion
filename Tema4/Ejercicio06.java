import java.util.Scanner;

public class Ejercicio06{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe la altura a la que tiras el objeto en metros: ");
    
    float h = x.nextFloat();
    
    if ( h>0 ){
      
      System.out.println("El tiempo que tarda en caer es: "+Math.sqrt((2*h)/9.81));
      
      }
      
    else{
      
      System.out.println("No tiene solución real");
      
      }
    
    
    }
  }
