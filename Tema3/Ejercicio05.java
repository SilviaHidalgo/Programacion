import java.util.Scanner;

public class Ejercicio05 { 
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe la base y la altura del rectángulo en centímetros separados por un espacio: ");
  
    int dato1 = x.nextInt();
    int dato2 = x.nextInt();
    
   
    System.out.println("El área del rectángulo es: "+(dato1*dato2)+" centimetroscuadrados");
    
  
  }
}
