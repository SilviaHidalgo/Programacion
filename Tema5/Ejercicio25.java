import java.util.Scanner;

public class Ejercicio25{
  public static void main (String[] args){
  
    Scanner x = new Scanner(System.in);
  
    System.out.println("Escribe un número y lo escribiré del revés: ");
  
    int num = x.nextInt();
    int reves = 0;
    
    while (num>0){
    
      reves = (reves*10)+(num%10);
    
      num= num/10;
    
    }
    
    System.out.println("El número del revés es "+reves);
  
  }
}
