import java.util.Scanner;

public class Ejercicio21{
  public static void main(String[] args){
   
   Scanner x = new Scanner(System.in);
   
   System.out.println("¿Cuál fue la nota de tu primer examen?");
   
   float nota1 = x.nextFloat();
   
   System.out.println("¿Cuál fue la nota de tu segundo examen?");
   
   float nota2 = x.nextFloat();
   
   float media = (nota1 +nota2) /2;
   
    if (media>=5){
     
    System.out.println("Tu nota media es: "+media);
    
    }
    
    else{
      
      System.out.println("¿Cuál a sido el resultado de la recuperación? apto/no apto.");
    
      String recu = x.next();
    
      if(recu.equals("apto")){
        
        System.out.println("Tu nota media es: 5");
        
        }
        
      else{
        
        System.out.println("Tu nota media es: "+media);
        
        }
    
    }
   
    
  }
}
