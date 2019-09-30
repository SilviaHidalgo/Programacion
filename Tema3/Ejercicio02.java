import java.util.Scanner;

public class ejercicio02 { 
  public static void main(String[] args){
    
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe la cantidad en euros que quieres convertir a pesetas: ");
    double cantidadEuros = x.nextDouble();
    double pesetas = 166.386;
    
    
    System.out.print (((double)cantidadEuros*pesetas)+" pesetas.");
  
  
  }
}
