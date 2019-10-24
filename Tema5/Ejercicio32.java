import java.util.Scanner;

public class Ejercicio32{
  public static void main (String[] args){
  
    Scanner x = new Scanner(System.in);
  
    System.out.println("Escribe un numero sacare los pares y los sumare: ");
    
    int num = x.nextInt();
    
    int digito = 0;
    
    int div = num;
    
    int suma = 0;
    
    int reves = 0;
    
    while (div>0){
      
      digito = div%10;
      
      div=div/10;
      
      reves = reves*10 + digito;
    
    }
    
    div = reves;
    
    while(div>0){
      
      digito = div%10;
      
      div=div/10;
      
      if((digito%2)==0){
      
        System.out.print(digito+(" "));
        
        suma = suma + digito;
      
      }
    
    }
   
   System.out.println("");
   
   System.out.println("La suma de los numeros pares es: "+suma);
   
  }
}
