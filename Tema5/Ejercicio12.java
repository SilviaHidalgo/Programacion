import java.util.Scanner;

public class Ejercicio12{
  public static void main (String[] args){
  
    Scanner x = new Scanner(System.in);
    
    System.out.print("Escribe numero de numeros que deseas ver de la serie de fibonacci: ");
    
    int n = x.nextInt();
    int aux = 1;
    int fibo = 0;
    int fibof = 0;
    int count = 0;
    
    do{
      
      System.out.println(fibof);
      
      fibof = fibo + aux;
      
      aux = fibo;
      
      fibo = fibof;
      
      count++;
    
    }
    
    while(count<=n);
  
  }
}
