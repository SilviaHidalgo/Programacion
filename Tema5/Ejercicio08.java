import java.util.Scanner;

public class Ejercicio08 {
    public static void main (String[] args){
    
      Scanner x = new Scanner(System.in);
      
      System.out.print("Escribe el numero del que desees la tabla de multiplicar: ");
      
      int num = x.nextInt();
      int mult;
      
      for(int i=1; i<=10; i++){
        
      mult = num * i;
      
      System.out.println (num+" x "+i+" = "+mult);
      
      }
   
    
    }
}
