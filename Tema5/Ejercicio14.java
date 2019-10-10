import java.util.Scanner;

public class Ejercicio14{
  public static void main (String[] args){
      
    Scanner x = new Scanner(System.in);
    
    System.out.print("Escribe una base: ");
    
    long base = x.nextInt();
    
    System.out.print("Escribe una potencia: ");
    
    long potencia = x.nextLong();
    
    long numFinal = base;
    
    for (long i=1; i<potencia; i++){
      
      numFinal = numFinal*base;
      
    }
    
    System.out.println("El numero "+base+" elevado a "+potencia+" es "+numFinal);
      
  }
}
