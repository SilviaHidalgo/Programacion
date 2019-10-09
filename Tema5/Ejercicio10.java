import java.util.Scanner;

public class Ejercicio10{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    long num;
    long sum = 0;
    long cont=0;
    long media;
    
    do{
      
      System.out.print ("Escribe una numeros para hacer una media se parara cuando se introduzca uno negativo: ");
      
      num = x.nextLong();
      
      sum = sum + num;
      
      cont++;
      
    
    }
    
    while (num>=0);
    
    media = sum / cont;
    
    System.out.println ("La media de los numeros es "+media);
    
  
  }
}
