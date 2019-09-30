import java.util.Scanner;

public class Ejercicio05{
  public static void main (String[] args){
    
    System.out.println("Este programa resuelve ecuaciones del tipo ax+b=0");
    
    Scanner d = new Scanner(System.in);
    
    System.out.println("Escribe un valor para a: ");
    
      double a = d.nextDouble();
    
    Scanner k = new Scanner(System.in);
    
    System.out.println("Escribe un valor para b: ");
     
     double b = k.nextDouble();
     double x;
     
    if(a!=0){
      
      x = -b/a;
      
      System.out.println("x es igual a: "+x);
      
      }
      
    else{
      
      System.out.println("Esta ecuación no tiene una solución real");
      
      }
    }
  }
