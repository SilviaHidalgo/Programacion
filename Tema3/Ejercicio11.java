import java.util.Scanner;

public class Ejercicio11 { 
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe la cantidad en Kb: ");
  
    int kb = x.nextInt();
    
    
    
   
    System.out.println(kb+" Kb son: "+((double)kb/1024)+" Mb");
    
  }
}
