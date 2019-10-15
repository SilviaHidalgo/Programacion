import java.util.Scanner;

public class Ejercicio17{
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.print("Escriba un numero positivo y se le sumaran los 100 siguientes números al introducido: ");
    
    long num = x.nextLong();
    long numFinal = 0;
    
    if(num<0){
      
    System.out.println("El número introducido no es positivo");
    
    }
    
    else{
      
      for( long i=num; i<(num+100);i++){
        
        numFinal = numFinal + i ;
        
        }
    }
  
    System.out.println("La suma de los 100 siguientes numeros es "+numFinal);
  }
}
