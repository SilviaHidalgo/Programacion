import java.util.Scanner;

public class Ejercicio10 { 
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe la cantidad en Mb: ");
  
    int mb = x.nextInt();
    
    
    
   
    System.out.println(mb+" Mb son: "+(mb*1024)+" Kb");
    
  }
}
