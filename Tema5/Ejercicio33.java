import java.util.Scanner;
  
public class Ejercicio33{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.print("Escribe la altura de la u que quieres que dibuje: ");
    
    int altura = x.nextInt();
    
    
    for(int i=1; i<altura; i++){
      
      System.out.print("* ");
      
      for (int j=2; j<altura; j++){
      
      System.out.print("  ");
      
      }
      
      System.out.println("*");
    
    }
    
    System.out.print("  ");
    
    for (int i=2; i<altura; i++){
      
      System.out.print("* ");
    
    }
    
  }
}
