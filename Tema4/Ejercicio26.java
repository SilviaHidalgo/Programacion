import java.util.Scanner;

public class Ejercicio26 {
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Venta de entradas CineCampa");
    
    System.out.println("Numero de entradas:");
     
      int num = x.nextInt();
    
    System.out.println("Día de la semana:");
    
      String dia = x.next();
      
    System.out.println("¿Tiene tarjeta CineCampa?(s/n): ");
    
      String tarjeta = x.next();
    
    System.out.println("Gracias, aquí tiene desglosada su compra.");
    
    double precio;
    double precioParejas;
    double total;
    double descu;
    double descuento;
    double importe;
    int parejas;
    
    if (tarjeta.equals("s")){
      
      descu = 0.10;
      
    }
      
    else{
      
      descu = 0;
      
    }
    
    
    switch(dia){
      
      case "miercoles":
      
      precio = 5;
      
      total = num * precio;
      descuento= total * descu;
      importe = total - descuento;
    
      System.out.printf(" %-20s %6d\n", "Entradas individuales", num);
      System.out.printf(" %-20s %6.2f %6s \n", "Precio por entrada", precio, "euros");
      System.out.printf(" %-20s %6.2f %6s \n", "Total", total, "euros");
      System.out.printf(" %-20s %6.2f %6s  \n", "Descuento", descuento, "euros");
      System.out.printf(" %-20s %6.2f %6s  \n", "A pagar", importe, "euros");
    
      break;
      
      case "jueves":
      
      if(num>=2){
        if(num%2==0){
          
          precioParejas=11;
          parejas= num/2;
          
          total = parejas * precioParejas;
          descuento= total * descu;
          importe = total - descuento;
    
          System.out.printf(" %-30s %6d \n", "Entradas de pareja", parejas);
          System.out.printf(" %-30s %6.2f %6s \n", "Precio por entrada de pareja", precioParejas, "euros");
          System.out.printf(" %-30s %6.2f %6s \n", "Total", total, "euros");
          System.out.printf(" %-30s %6.2f %6s  \n", "Descuento", descuento, "euros");
          System.out.printf(" %-30s %6.2f %6s  \n", "A pagar", importe, "euros");
          
        }
        else{
          
        parejas=num/2;
        precioParejas =11;
        precio=8;
        
        total = (parejas * precioParejas)+precio;
        descuento= total * descu;
        importe = total - descuento;
    
        System.out.printf(" %-30s %6d \n", "Entradas de pareja", parejas);
        System.out.printf(" %-30s %6.2f %6s \n", "Precio por entrada de pareja", precioParejas, "euros");
        System.out.printf(" %-30s %6d \n", "Entradas individuales", 1);
        System.out.printf(" %-30s %6.2f %6s \n", "Precio por entrada", precio, "euros");
        System.out.printf(" %-30s %6.2f %6s \n", "Total", total, "euros");
        System.out.printf(" %-30s %6.2f %6s  \n", "Descuento", descuento, "euros");
        System.out.printf(" %-30s %6.2f %6s  \n", "A pagar", importe, "euros");
      
    
        }
        
      }
      else{
        
        precio = 8;
        
        total = num * precio;
        descuento= total * descu;
        importe = total - descuento;
        
        System.out.printf(" %-20s %6d \n", "Entradas individuales", num);
        System.out.printf(" %-20s %6.2f %6s \n", "Precio por entrada", precio, "euros");
        System.out.printf(" %-20s %6.2f %6s \n", "Total", total, "euros");
        System.out.printf(" %-20s %6.2f %6s  \n", "Descuento", descuento, "euros");
        System.out.printf(" %-20s %6.2f %6s  \n", "A pagar", importe, "euros");
        
      }
      
      break;
      
      default:
    
        precio=8;
        
        total = num * precio;
        descuento= total * descu;
        importe = total - descuento;
        
        System.out.printf(" %-20s %6d \n", "Entradas individuales", num);
        System.out.printf(" %-20s %6.2f %6s \n", "Precio por entrada", precio, "euros");
        System.out.printf(" %-20s %6.2f %6s \n", "Total", total, "euros");
        System.out.printf(" %-20s %6.2f %6s  \n", "Descuento", descuento, "euros");
        System.out.printf(" %-20s %6.2f %6s  \n", "A pagar", importe, "euros");
      
      break;
    
    }
    
  }
}
