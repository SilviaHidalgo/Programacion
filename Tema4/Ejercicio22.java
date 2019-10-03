import java.util.Scanner;

public class Ejercicio22{
  public static void main(String[] args){
  
  Scanner x = new Scanner(System.in);
  
  System.out.println("¿A que día estás?");
  
  String dia = x.next();
  
  System.out.println("¿Qué hora es?");
  
  int hora = x.nextInt();
  
  System.out.println("¿Qué minuto es?");
  
  int minuto = x.nextInt();
  
  int minDia=24*60;
  int minVie=15*60;
  int minFinde;
  
  
  switch (dia){
    
    case "lunes":
      
      minFinde = (minDia-(hora*60)+minuto)+(minDia*3)+minVie;
      
      System.out.println("Quedan "+minFinde+" minutos para el fin de semana.");
      
    break;
    
    case "martes":
    
      minFinde = (minDia-(hora*60)+minuto)+(minDia*2)+minVie;
      
      System.out.println("Quedan "+minFinde+" minutos para el fin de semana.");
      
    break;
    
    case "miercoles":
    
      minFinde = (minDia-(hora*60)+minuto)+minDia+minVie;
      
      System.out.println("Quedan "+minFinde+" minutos para el fin de semana.");
      
    break;
    
    case "jueves":
    
      minFinde = (minDia-((hora*60)+minuto))+minVie;
      
      System.out.println("Quedan "+minFinde+" minutos para el fin de semana.");
      
    break;
    
    case "viernes":
    
      minFinde = minVie-((hora*60)+minuto);
      
      System.out.println("Quedan "+minFinde+" minutos para el fin de semana.");
      
    break;
    
    }
  }
}
