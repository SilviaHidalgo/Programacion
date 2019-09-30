import java.util.Scanner;

public class Ejercicio04{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe las horas que has trabajado para saber tu sueldo: ");
    
    int horas = x.nextInt();
    int horasExt;
    int sueldo;
    
    if (horas<=40){
      
      sueldo = horas*12;
      
      }
      
    else{
      
      horasExt = horas -40;
      sueldo =(40*12)+(horasExt*16);
      
      }  
    
    System.out.println("Tu sueldo es de "+sueldo+" euros.");
    
    }
  }
