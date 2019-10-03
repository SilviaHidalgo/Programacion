import java.util.Scanner;

public class Ejercicio23 {
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
      System.out.print("Introduce la base imponible: ");
    
      double precio = x.nextDouble();
    
    System.out.println("Introduce el tipo de IVA (general, reducido o superreducido): ");
     
      String iva = x.next();
    
    System.out.print("Introduce el código promocional(nopro, mitad, menos5 o 5porc): ");
    
      String promocion = x.next();
    
    double numIva = 0;
    double descu = 0;
    double total = 0;
    double precioIva = 0;
    
    System.out.printf("%-25s %8.2f \n", "Base imponible", precio);
    
    switch (iva){
      
        case "general":
        
          numIva= precio*0.21;
          precioIva = precio + numIva;
          System.out.printf("%-25s %8.2f \n", "IVA", numIva);
          System.out.printf("%-25s %8.2f \n", "Precio con iva", precioIva);
        
        break;
      
        case "reducido":
        
          numIva=precio*0.10;
          precioIva = precio + numIva;
          System.out.printf("%-25s %8.2f \n", "IVA", numIva);
          System.out.printf("%-25s %8.2f \n", "Precio con iva", precioIva);
        
        break;
    
        case "superreducido":
        
          numIva=precio*0.04;
          precioIva = precio + numIva;
          System.out.printf("%-25s %8.2f \n", "IVA", numIva);
          System.out.printf("%-25s %8.2f \n", "Precio con iva", precioIva);
        
        break;
    
    
    }
      
    switch (promocion){
      
      case "nopro":
        
        descu=0;
        total = precioIva + descu;
        System.out.printf("%-25s %8.2f \n", "Código promo", descu);
        System.out.printf("%-25s %8.2f \n", "TOTAL", total);
        
      break;
      
      case "mitad":
        
        descu=-(precio/2);
        total = precioIva + descu;
        System.out.printf("%-25s %8.2f \n", "Código promo", descu);
        System.out.printf("%-25s %8.2f \n", "TOTAL", total);
        
      break;
    
      case "menos5":
        
        descu=-5;
        total = precioIva + descu;
        System.out.printf("%-25s %8.2f \n", "Código promo", descu);
        System.out.printf("%-25s %8.2f \n", "TOTAL", total);
        
      break;
      
      case "5porc":
        
        descu=-(precio*0.05);
        total = precioIva + descu;
        System.out.printf("%-25s %8.2f \n", "Código promo", descu);
        System.out.printf("%-25s %8.2f \n", "TOTAL", total);
        
      break;
  
    }
  }
}
