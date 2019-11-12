import java.util.Scanner;

public class Ejercicio05{
  public static void main(String [] args){
  
    Scanner x = new Scanner(System.in);
  
    int[] num = new int [10];
    int max=0;
    int min=0;
    

    for(int i=0;i<10;i++){
    
      System.out.print("Escribe el número entero que desee almacenar: ");
      
      num [i] = x.nextInt();
      
      System.out.println("");
    
    }
    
    min= num[0];
    
    for(int i=0;i<10;i++){
      
      if(num[i]>max){
        
          max = num[i];
          
      }
      
      if(num[i]<min){
      
        min= num[i];
      
      }
      
    }
    
    for(int i=0;i<10;i++){
    
      if(num[i]==max){
      
        System.out.println(num[i]+" máximo");
      
      }
      
      else{
      
        if(num[i]==min){
        
          System.out.println(num[i]+" mínimo");
        
        }
        
        else{
        
          System.out.println(num[i]);
        
        }
      
      }
    
    }
    
  }
}
