import java.util.Scanner;

public class Ejercicio06{
  public static void main(String [] args){
  
    Scanner x = new Scanner(System.in);
  
    int[] num = new int [15];
    int aux = 0;
    int aux2 = 0;
    int despFinal = 0;
    

    for(int i=0;i<15;i++){
    
      System.out.print("Escribe el número entero que desee almacenar: ");
      
      num [i] = x.nextInt();
      
      System.out.println("");
    
    }
    
    despFinal= num[14];
    aux= num[0];
    
    for(int i=1;i<15;i++){
      
        aux2=num[i];
        num[i]=aux;
        aux=aux2;
      
    }
    
    num[0]=despFinal;
    
    for(int i=0;i<15;i++){
    
          System.out.println(num[i]);
    
    }
    
  }
}
