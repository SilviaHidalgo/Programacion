import java.util.Scanner;

public class Ejercicio29{
  public static void main (String[] args){
  
    Scanner x = new Scanner(System.in);
  
    System.out.print("¿Qué a tomado para comer?(palmera, donut o pitufo): ");
  
    String comida = x.next();
    
    double precioComida = 0;
    double precioBebida = 0;
    double total;
  
    switch(comida){
      
      case "palmera":
        
        precioComida = 1.40;
      
      break;
      
      case "donut":
        
        precioComida = 1.00;
      
      break;
      
      case "pitufo":
        
        System.out.print("¿Con que lo has tomado? (aceite o tortilla): ");
        
        String tipoPitufo = x.next();
        
        if(tipoPitufo.equals("aceite")){
          
          precioComida = 1.20;
          comida = comida+" de "+tipoPitufo;
          
        }
        
        else{
        
          if(tipoPitufo.equals("tortilla")){
          
            precioComida = 1.60;
            comida = comida+" de "+tipoPitufo;
        
          }
          
          else{
           
           System.out.println("Se equivoco al decir el tipo de pitufo");
           
          }
        }
        
      break;
      
      default:
      
        System.out.println("Se equivoco al decir el desayuno");
        
      break;

    }
    
    System.out.print("¿Qué a tomado para beber?(zumo o cafe): ");
  
    String bebida = x.next();
    
    switch(bebida){
    
      case "zumo":
        
        precioBebida = 1.50;
      
      break;
      
      case "cafe":
        
        precioBebida = 1.20;
      
      break;
      
      default:
        
        System.out.println("Se equivoco al escribir la bebida");
      
      break;
  
    }
    
    total = precioComida + precioBebida;
    
    System.out.printf("%-20s %6.2f %7s \n", comida, precioComida,"euros");
    
    System.out.printf("%-20s %6.2f %7s \n", bebida, precioBebida, "euros");
    
    System.out.printf("%-20s %6.2f %7s \n", "Total:", total, "euros");
    
  }
}
