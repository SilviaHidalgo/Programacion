import java.util.Scanner;

public class Ejercicio16{
  public static void main (String[] args){
   
    Scanner x = new Scanner(System.in);
    
    System.out.print("Escribe un número y te diré si es primo: ");
    
    int num = x.nextInt();
    boolean primo= true;
        
    for(int i=2; i<num;i++){
      
      if ( num%i==0 && num!=2){
      
        primo=false;
        
      }
    
    }
    
    if(primo){
      
      System.out.print("El número "+num+" es un número primo");  
        
    }
    
    else{
      
     System.out.print("El número "+num+" no es un número primo"); 
    
    }
  }
}
