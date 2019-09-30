import java.util.Scanner;

public class ejercicio01 { 
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe 2 números enteros separados por un espacio para multiplicarlos");
  
    int dato1 = x.nextInt();
    int dato2 = x.nextInt();
    
    int multiplicacion = dato1*dato2;
    
    System.out.println("La multiplicación es: "+multiplicacion);
  
  
  }
}
