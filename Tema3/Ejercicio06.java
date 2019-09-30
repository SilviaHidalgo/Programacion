import java.util.Scanner;

public class Ejercicio06 { 
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe la base y la altura del triángulo en centímetros separados por un espacio: ");
  
    int dato1 = x.nextInt();
    int dato2 = x.nextInt();
    
   
    System.out.println("El área del triángulo es: "+(((double)dato1*(double)dato2)/2)+" centimetroscuadrados");
    
  }
}
