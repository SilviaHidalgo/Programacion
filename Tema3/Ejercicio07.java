import java.util.Scanner;

public class Ejercicio07 { 
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe la cantidad que quieres calcular sin iva: ");
  
    double dato1 = x.nextDouble();
    double iva = dato1*0.21;
    double cantidadSinIva = dato1-iva;
    
   
    System.out.println("Tu cantidad es "+dato1+" el iva de esa cantidad es "+iva+" y la cantidad sin iva es "+cantidadSinIva);
    
  }
}
