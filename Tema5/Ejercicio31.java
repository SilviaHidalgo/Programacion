import java.util.Scanner;

public class Ejercicio31{
  public static void main (String[] args){
  
    Scanner x = new Scanner(System.in);
  
    System.out.println("Determina la altura de la L: ");
    
    int altura = x.nextInt();
    
    int base = (altura/2)+1;
    
    System.out.println("");
    
    for(int i=1; i<altura; i++){
    
    System.out.println("*");
    
    }
    
    for(int i=0; i<base; i++){
    
    System.out.print("* ");
    
    }
   
  }
}
