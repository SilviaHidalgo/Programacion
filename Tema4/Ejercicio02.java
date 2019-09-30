import java.util.Scanner;

public class Ejercicio02{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe la hora separada por un . : ");
    
    double hora = x.nextDouble();
    
    if (hora>=6.00 && hora<=12.59){
      
      System.out.println("Buenos dias");}
      
    else{
      
      if (hora>=13.00 && hora<=20.59){
      
        System.out.println("Buenas tardes");}
      
    
      else  {
        System.out.println("Buenas noches");}
      
    }
  
  }
}
