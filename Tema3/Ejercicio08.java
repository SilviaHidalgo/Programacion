import java.util.Scanner;

public class Ejercicio08 { 
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe la cantidad de horas trabajadas esta semana: ");
  
    int horas = x.nextInt();
    int eurosHora = 12;
    
   
    System.out.println("Cobrarás: "+(horas*eurosHora)+" euros");
    
  }
}
