import java.util.Scanner;

public class Ejercicio29{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.print("Escribe un número y te diré todos los números positivos enteros menores a este: ");
  
    int max = x.nextInt();
    
    System.out.print("Además no serán divisibles entre el número que escribas a continuación: ");
    
    int divisible = x.nextInt();
    
    for(int i=max; i>0;i--){
      
      if (i%divisible!=0){
        
        System.out.println(i+"   ");
      
      }
      
    }
  
  }
}
