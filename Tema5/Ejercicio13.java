import java.util.Scanner;

public class Ejercicio13{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    int num;
    int positivo = 0;
    int negativo = 0;
   
    for(int i=0; i<10; i++){
    
      System.out.print("Escribe un numero y lo ordenare en negativo y positivo: ");
      
      num= x.nextInt();
      
      if(num>0){
      
        positivo++;
    
      }
    
      else{
      
        negativo++;
    
      }
     
    }
    
    System.out.println("Has escrito "+positivo+" números positivos y "+negativo+" números negativos");
      
  }
}
