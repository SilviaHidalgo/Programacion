import java.util.Scanner;

public class Ejercicio07{
  public static void main(String [] args){
  
    Scanner x = new Scanner(System.in);
  
    int[] num = new int [100];
    int cambio = 0;
    int cambiado = 0;
 
    

    for(int i=0;i<100;i++){
    
     num[i]=(int)(Math.random()*21);
    
    }
    
    for(int i=0;i<100;i++){
    
          System.out.print(num[i]+" ");
    
    }
    
    System.out.println("\n");
    
    System.out.print("Escriba el número que desea cambiar: ");
    
    cambio = x.nextInt();
    
    System.out.print("Escriba el número por el que quiere cambiarlo: ");
    
    cambiado = x.nextInt();
    
    System.out.println("\n");
    
    for(int i=0;i<100;i++){
      
      if (num[i]==cambio){
        
        System.out.print("'"+cambiado+"' ");
      
      }
      
      else{
        
          System.out.print(num[i]+" ");
          
      }
    
    }
    
  }
}
