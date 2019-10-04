import java.util.Scanner;

public class Ejercicio27{
  public static void main(String[] args){
  
    Scanner x = new Scanner(System.in);
  
    System.out.println("Elija un sabor de tarta (manzana, fresa o chocolate)");
  
    String sabor = x.next();
      
    double tarta = 0;
    double nataPrecio = 0;
    double nombrePrecio = 0;
    double total;
    String tipoChoco = "";
    
    switch (sabor){
      
      case "manzana":
      
        tarta=18;
      
      break;
      
      case "fresa":
      
        tarta=16;
      
      break;
      
      case "chocolate":
      
      System.out.println("¿Qué tipo de chocolate? (negro o blanco)");
  
      tipoChoco = x.next();
      
        if (tipoChoco.equals("negro")){
          
          tarta=14;
          
        }

        else{
      
          if (tipoChoco.equals("blanco")){
          
            tarta=15;
          
          }
        
          else{
        
          System.out.println("El tipo de chocolate es incorrecto");
          
          }
        }
      
      break;
      
      default:
      
        System.out.println("El sabor elegido no es correcto");
        
      break;
      
    }
    
    System.out.println("¿Quiere nata?(s/n)");
      
      String nata = x.next();
    
    System.out.println("¿Quieres ponerle nombre?(s/n)");
    
      String nombre = x.next();
    
    
    System.out.println("Tarta de "+sabor+": "+tarta);
  
    if(nata.equals("s")){
      
      nataPrecio = 2.50;
      
      System.out.println("Con nata: "+nataPrecio+" euros");
    
    }
  
    if(nombre.equals("s")){
      
      nombrePrecio = 2.75;
      
      System.out.println("Con nata: "+nombrePrecio+" euros");
    
    }
  
    total = tarta + nataPrecio + nombrePrecio;
    
    System.out.println("Total: "+total+" euros");
  
  }
}

