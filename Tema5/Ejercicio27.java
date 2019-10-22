import java.util.Scanner;

public class Ejercicio27{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.print("Escribe un número y te mostraré, contaré y sumare los multiplos de 3 que hay hasta dicho numero:");
  
    int num = x.nextInt();
    int suma = 0;
    int cont = 0;
    
    for(int i=1; i<=num;i++){
      
      if(i%3==0){
      
        System.out.print(i+" - ");
        
        suma = suma + i;
        
        cont++;
      
      }
      
    }
    
    System.out.println(" ");
  
    System.out.println("Hay "+cont+" múltiplos de 3");
    
    System.out.println("La suma de los múltiplos es "+suma);
  
  }
}
