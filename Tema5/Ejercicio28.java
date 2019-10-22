import java.util.Scanner;

public class Ejercicio28{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.print("Escribe un número y te mostraré el factorial: ");
  
    int num = x.nextInt();
    int factorial = 1;
    
    for(int i=num; i>0;i--){
      
      factorial=factorial*i;
      
    }
    
    System.out.println("El número factorial es "+factorial);
  
  }
}
