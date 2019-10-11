import java.util.Scanner;

public class Ejercicio15{
  public static void main (String[] args){
      
    Scanner x = new Scanner(System.in);
    
    System.out.print("Escribe una base: ");
    
    double base = x.nextInt();
    
    System.out.print("Escribe una exponente: ");
    
    int exponente = x.nextInt();
    
    double numFinal = base;
    
    System.out.println("El numero "+base+" elevado a 1 es "+base);
    
    for (int i=1; i<exponente; i++){
      
      numFinal = numFinal*base;
      
      System.out.println("El numero "+base+" elevado a "+(i+1)+" es "+numFinal);
      
    }
      
  }
}
