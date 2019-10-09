import java.util.Scanner;

public class Ejercicio07 {
    public static void main (String[] args){
    
      Scanner x = new Scanner(System.in);
      
      int combi;
   
      do{
        
        System.out.print ("Escribe la combinación de la caja fuerte: ");
      
        combi = x.nextInt();
        
        if (combi==1234){
        
        System.out.println("La combinación es correcta, la caja fuerte se ha abierto");
        
        }
        
        else{
        
        System.out.println("La combinación no es correcta, vuelve a intentarlo.");
        
        }
        
      }
      
      while(combi!=1234);
    }
}
