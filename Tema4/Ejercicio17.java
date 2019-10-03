import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe un numero entero y te dire la ultima cifra:");
    
      int numero = x.nextInt();
    
    System.out.println("La ultima cifra es "+(numero%10));
      
    
    }
  }
