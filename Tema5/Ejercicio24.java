import java.util.Scanner;

public class Ejercicio24{
    public static void main (String[] args){
    
    
      Scanner x = new Scanner(System.in);
      
      System.out.println("Escribe la altura de la piramide: ");
      
      int altura = x.nextInt();
      
      int espacio= altura-1;
      
      int planta=1;
      
      while(planta<=altura){
      
        for (int i=1; i<=espacio; i++){
        
          System.out.print(" ");
      
        }
        
        for(int j=1; j<planta; j++){
          
          System.out.print(j);
        
        }
        
        for(int k=planta; k>0; k--){
          
          System.out.print(k);
        
        }
        
        System.out.println();
        
        espacio--;
        planta++;
        
        
      }
      
    
    }
}
