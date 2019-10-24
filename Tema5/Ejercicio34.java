import java.util.Scanner;

public class Ejercicio34{
  public static void main (String[] args){
  
    Scanner x = new Scanner(System.in);
  
    System.out.println("Escribe un numero: ");
    
    int numPrimero = x.nextInt();
    
    System.out.println("Escribe un numero: ");
    
    int numSegundo = x.nextInt();
    
    
    int digitoPrimero = 0;
    int digitoSegundo= 0;
    int divPrimero = numPrimero;
    int divSegundo = numSegundo;
    int revesPrimero = 0;
    int revesSegundo =0;
    int pares = 0;
    int impares = 0;
    
    while (divPrimero>0){
      
      digitoPrimero = divPrimero%10;
      
      divPrimero = divPrimero/10;
      
      revesPrimero = revesPrimero*10 + digitoPrimero;
    
    }
    
    while (divSegundo>0){
      
      digitoSegundo = divSegundo%10;
      
      divSegundo = divSegundo/10;
      
      revesSegundo = revesSegundo*10 + digitoSegundo;
    
    }
    
    divPrimero = revesPrimero;
    
    divSegundo = revesSegundo;
    
    while((divPrimero>0) && (divSegundo>0)){
      
      digitoPrimero = divPrimero%10;
      
      divPrimero=divPrimero/10;
      
      digitoSegundo = divSegundo%10;
      
      divSegundo=divSegundo/10;
      
      if((digitoPrimero%2)==0){
      
        pares = (pares*10) + digitoPrimero;
      
      }
      
      else{
        
        impares = (impares*10) + digitoPrimero;
        
      }
    
      if((digitoSegundo%2)==0){
      
        pares = (pares*10) + digitoSegundo;
      
      }
      
      else{
        
        impares = (impares*10) + digitoSegundo;
        
      }
      
    }
    
    System.out.println("Los números pares son: "+pares);
    
    System.out.println("Los número impares son: "+impares);
   
   
  }
}
