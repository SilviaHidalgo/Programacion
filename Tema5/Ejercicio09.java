import java.util.Scanner;

public class Ejercicio09{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.print ("Escribe una numero y te dire los digitos que tiene: ");
    
    long num = x.nextLong();
    int cont = 0;
    
    while (num>0){
      
      num = num/10;
      
      cont++;
      
    }
    
    System.out.println ("El numero tiene "+cont+" digitos");
    
  
  }
}
