
import java.util.Scanner;

public class Ejercicio48 {
	
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    long num;
    long aux;
    boolean encontrado;
    String estan = "";
    String noEstan = "";
    
    
    System.out.println("Este programa te dice que digitos están y los que no están");
    
    System.out.print("Introduce un número entero: ");
    
    num = s.nextInt();
  
  
    for (int i = 0; i < 10; i++) {
      
      encontrado = false;
      aux = num;
      
      while(aux > 0) {
        
        if (aux % 10 == i) {
          
          encontrado = true;
          
        }
        
        aux= aux/10;
        
      } 

      if (encontrado) {
        
        estan = estan + i + " ";
        
      }
      
      else{
      
         noEstan = noEstan +i + " ";
      
      }
    }
    
    System.out.println("Los números encontrados son: "+estan);
    
    System.out.println("Los números no encontrados son: "+noEstan);
    
  }
}
