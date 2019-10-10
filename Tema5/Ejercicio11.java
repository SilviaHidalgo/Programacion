import java.util.Scanner;
import java.util.*;

public class Ejercicio11{
  public static void main (String[] args){
  
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe un numero y te dire el cuadrado y el cubo de los 5 primeros digitos: ");
    
    int num = x.nextInt();
    
    for( int i=num; i < num+5; i++){
    
      System.out.printf("%5d %5d %5d \n", i, i*i, i*i*i );
    
    }
    
  }
}
