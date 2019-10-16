import java.util.Scanner;

public class Ejercicio19{
    public static void main (String[] args){
    
    
      Scanner x = new Scanner(System.in);
      
      System.out.println("Escribe la altura de la piramide: ");
      
      int altura = x.nextInt();
      
      System.out.println("Escribe el simbolo con el que deseas pintarla: ");
      
      String s = x.next();
      
      int espacio= altura-1;
      
      int pintar= 1;
      
      int planta=1;
      
      while(planta<=altura){
      
        for (int i=1; i<=espacio; i++){
        
          System.out.print(" ");
      
        }
        
        for(int j=1; j<=pintar; j++){
          
          System.out.print(s);
        
        }
        
        System.out.println();
        
        espacio--;
        planta++;
        pintar+=2;
        
        
      }
      
    
    }
}
