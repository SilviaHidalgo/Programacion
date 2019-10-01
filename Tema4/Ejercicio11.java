import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String[] args){
    
    System.out.println("Este programa te dice que horoscopo eres");
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe la hora: ");
    
    int horas = x.nextInt();
    
    System.out.println("Escribe los minutos: ");
     
    int minutos = x.nextInt();
     
    int medianoche = 86400;
    int segundos;
    
    segundos = ((horas*60)*60)+(minutos*60);
    
    if (horas!=0 && minutos!=0){
      
        System.out.println("Quedan "+(medianoche-segundos)+" segundos hasta la medianoche.");
      
      }
      
    else{
      
      System.out.println("Ya es media noche.");
      
      }
    
    }
  }
