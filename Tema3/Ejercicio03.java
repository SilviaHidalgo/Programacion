import java.util.Scanner;

public class Ejercicio03 { 
  public static void main(String[] args){
    
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe la cantidad en pesetas que quieres convertir a euros: ");
    double cantidadPesetas = x.nextDouble();
    double centimos = 100;
    double pesetas = 166.386;
    double cantidadCentimos =(cantidadPesetas*centimos)/pesetas;
    
    
    System.out.print ((cantidadCentimos/100)+" euros.");
  
  
  }
}
