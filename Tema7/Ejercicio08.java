import java.util.Scanner;

public class Ejercicio08{
  public static void main(String[] args){
  
    Scanner x = new Scanner(System.in);
    
    int [] temperatura = new int [12];
    
    for (int i=0; i<12; i++){
    
      System.out.print("Escriba la temperatura media del mes "+(i+1)+": ");
      
      temperatura[i]= x.nextInt();
    
    }
    
    System.out.println("\n");
    
    System.out.printf("%10s %4s", "Enero", "|");
    
    for(int i=0; i<temperatura[0];i++){
      
      System.out.print("*");
      
    }
    System.out.println("");
    
    System.out.printf("%10s %4s", "Febrero", "|");
    
    for(int i=0; i<temperatura[1];i++){
      
      System.out.print("*");
      
    }
    
    System.out.println("");
    
    System.out.printf("%10s %4s", "Marzo", "|");
    
    for(int i=0; i<temperatura[2];i++){
      
      System.out.print("*");
      
    }
    
    System.out.println("");
    
    System.out.printf("%10s %4s", "Abril", "|");
    
    for(int i=0; i<temperatura[3];i++){
      
      System.out.print("*");
      
    }
    
    System.out.println("");
    
    System.out.printf("%10s %4s", "Mayo", "|");
    
    for(int i=0; i<temperatura[4];i++){
      
      System.out.print("*");
      
    }
    
    System.out.println("");
    
    System.out.printf("%10s %4s", "Junio", "|");
    
    for(int i=0; i<temperatura[5];i++){
      
      System.out.print("*");
      
    }
    
    System.out.println("");
    
    System.out.printf("%10s %4s", "Julio", "|");
    
    for(int i=0; i<temperatura[6];i++){
      
      System.out.print("*");
      
    }
    
    System.out.println("");
    
    System.out.printf("%10s %4s", "Agosto", "|");
    
    for(int i=0; i<temperatura[7];i++){
      
      System.out.print("*");
      
    }
    
    System.out.println("");
    
    System.out.printf("%10s %4s", "Septiembre", "|");
    
    for(int i=0; i<temperatura[8];i++){
      
      System.out.print("*");
      
    }
    
    System.out.println("");
    
    System.out.printf("%10s %4s", "Octubre", "|");
    
    for(int i=0; i<temperatura[9];i++){
      
      System.out.print("*");
      
    }
    
    System.out.println("");
    
    System.out.printf("%10s %4s", "Noviembre", "|");
    
    for(int i=0; i<temperatura[10];i++){
      
      System.out.print("*");
      
    }
    
    System.out.println("");
    
    System.out.printf("%10s %4s", "Diciembre", "|");
    
    for(int i=0; i<temperatura[11];i++){
      
      System.out.print("*");
      
    }
  
  }
}
