import java.util.Scanner;

public class Ejercicio03{
  public static void main(String [] args){
  
    Scanner x = new Scanner(System.in);
  
    int[] num = new int [9];
    

    for(int i=0;i<9;i++){
    
      System.out.print("Escribe el número entero que desee almacenar: ");
      
      num [i] = x.nextInt();
      
      System.out.println("");
    
    }
    
    for(int j=8;j>=0;j--){
      
      System.out.println(num[j]);
    
    }
    
  }
}
