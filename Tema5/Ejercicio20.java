import java.util.Scanner;

public class Ejercicio20{
    public static void main (String[] args){
    
    
      Scanner x = new Scanner(System.in);
      
      System.out.println("Escribe la altura de la piramide: ");
      
      int altura = x.nextInt();
      
      System.out.println("Escribe el simbolo con el que deseas pintarla: ");
      
      String s = x.next();
      
      int pintar= altura-1;
      
      int espacio= 1;
      
      int planta=1;
      
      while(planta<altura){
      
        for (int i=1; i<=pintar; i++){
        
        System.out.print(" ");
        
        }
      
        System.out.print(s);
        
       
        
      if(planta>1){
        
         for(int j=1; j<=espacio; j++){
          
          System.out.print(" ");
        
        }
        
        System.out.print(s);
        
        espacio+=2;
        
      }
      
         System.out.println();
        
        
        pintar--;
        planta++;
        
        
        
      }
      
      for( int k=1; k<=altura; k++){
        
        System.out.print(s);
        
        System.out.print (" ");
      
      }
      
    
    }
}
