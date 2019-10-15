import java.util.Scanner;

public class Ejercicio18{
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.print("Escriba el primer número: ");
    
    long numMin = x.nextLong();
    
    System.out.print("Escriba el segundo número: ");
    
    long numMax = x.nextLong();
    long aux = 0;
    
    if (numMin>numMax){
        
        aux = numMin;
        numMin = numMax;
        numMax = aux;
    }
    
    
    if(numMin!=numMax){
      
        
        for( long i=numMin; i<numMax; i=i+7){
        
          System.out.println (i);
          
        }
    
    }
    
    else{
      
      System.out.println("Los números introducidos son iguales");
        
    }
    
  }
}
