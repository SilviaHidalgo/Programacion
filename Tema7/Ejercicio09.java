import java.util.Scanner;

public class Ejercicio09{
  public static void main(String[] args){
  
    Scanner x = new Scanner(System.in);
    
    int [] num = new int [8];
    
    for (int i=0; i<8; i++){
    
      System.out.print("Escriba un número: ");
      
      num[i]= x.nextInt();
    
    }
    
    System.out.println("\n");
    
    for (int i=0; i<8; i++){
    
      if(num[i]%2==0){
      
        System.out.println(num[i]+" Es par");
      
      }
      
      else{
      
        System.out.println(num[i]+" Es impar");
      
      }
    
    }
    
    
    
  }
}
