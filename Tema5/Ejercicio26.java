import java.util.Scanner;

public class Ejercicio26{
  public static void main (String[] args){
  
    Scanner x = new Scanner(System.in);
  
    System.out.println("Escribe un numero: ");
  
    int num = x.nextInt();
    
    System.out.println("Escribe el número y te diré su posición: ");
    
    int dig = x.nextInt();
    
    int reves = 0;
    
    int longi = 0;
    
    int posicion = 1;
    
    if (num==0){
    
      longi=1;
    
    }
    
    while (num>0){
    
      reves = (reves*10)+(num%10);
    
      num= num/10;
      
      longi++;
    
    }
    
    while (reves>0){
    
      if ((reves%10)==dig){
        
        System.out.println("La posicion de "+dig+" es "+posicion);
      
      }
      
      reves=reves/10;
      posicion++;
      
    }
  
  }
}
