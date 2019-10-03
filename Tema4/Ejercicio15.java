import java.util.Scanner;

public class Ejercicio15 {
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("¿En que dirección quieres la pirámide?");
    
      String forma = x.next();
      
    System.out.println("¿con que simbolo la quires dibujada?");
    
      String simbolo = x.next();
      
    if (forma.equals("derecha")){
      
      System.out.println(simbolo);
      System.out.println(simbolo+simbolo);
      System.out.println(simbolo+simbolo+simbolo);
      System.out.println(simbolo+simbolo+simbolo+simbolo);
      System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo);
      System.out.println(simbolo+simbolo+simbolo+simbolo);
      System.out.println(simbolo+simbolo+simbolo);
      System.out.println(simbolo+simbolo);
      System.out.println(simbolo);
      
      }
      
    if (forma.equals("izquierda")){
      
      System.out.println("    "+simbolo);
      System.out.println("   "+simbolo+simbolo);
      System.out.println("  "+simbolo+simbolo+simbolo);
      System.out.println(" "+simbolo+simbolo+simbolo+simbolo);
      System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo);
      System.out.println(" "+simbolo+simbolo+simbolo+simbolo);
      System.out.println("  "+simbolo+simbolo+simbolo);
      System.out.println("   "+simbolo+simbolo);
      System.out.println("    "+simbolo);
      
      }
    
    if (forma.equals("arriba")){
      
      System.out.println("    "+simbolo);
      System.out.println("   "+simbolo+simbolo+simbolo);
      System.out.println("  "+simbolo+simbolo+simbolo+simbolo+simbolo);
      System.out.println(" "+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
      System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
      
      }
      
    if (forma.equals("abajo")){
      
      System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
      System.out.println(" "+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
      System.out.println("  "+simbolo+simbolo+simbolo+simbolo+simbolo);
      System.out.println("   "+simbolo+simbolo+simbolo);
      System.out.println("    "+simbolo);
      
      }

    
  }
}
