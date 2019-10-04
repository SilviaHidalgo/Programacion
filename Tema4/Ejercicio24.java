import java.util.Scanner;

public class Ejercicio24 {
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Introduce el cargo de empleado(prog.junior, prog.senior o jefe de proyecto):");
     
      String cargo = x.next();
    
    System.out.println("Introduce su estado civil (soltero o casado): ");
    
      String estado = x.next();
      
    System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
    
    int dias = x.nextInt();
    double sueldo = 0;
    double dietas = 0;
    double sueldoBruto = 0;
    double retencion = 0;
    double neto;
    
    System.out.println("--------------------------------");
    
    
    
    switch (cargo){
      
        case "prog.junior":
        
          sueldo = 950;
          dietas = dias * 30;
          System.out.printf("| %-20s %6.2f | \n", "Sueldo base", sueldo);
          System.out.printf("| %-20s %7.2f | \n", "Dietas( "+dias+" viajes)", dietas);
          
        
        break;
      
        case "prog.senior":
        
          sueldo = 1200;
          dietas = dias * 30;
          System.out.printf("| %-20s %6.2f | \n", "Sueldo base", sueldo);
          System.out.printf("| %-20s %7.2f | \n", "Dietas( "+dias+" viajes)", dietas);
          
        break;
    
        case "jefe de proyecto":
        
          sueldo = 1600;
          dietas = dias * 30;
          System.out.printf("| %-20s %6.2f | \n", "Sueldo base", sueldo);
          System.out.printf("| %-20s %7.2f | \n", "Dietas( "+dias+" viajes)", dietas);
        
        break;
    }
    
    System.out.println("|------------------------------|");
      
    switch (estado){
      
      case "soltero":
        
        sueldoBruto = sueldo + dietas;
        retencion = sueldoBruto * 0.25;
        System.out.printf("| %-20s %6.2f | \n", "Sueldo bruto", sueldoBruto);
        System.out.printf("| %-20s %7.2f | \n", "Retencion IRPF(25%)", retencion);
        
        
      break;
      
      case "casado":
        
        sueldoBruto = sueldo + dietas;
        retencion = sueldoBruto * 0.20;
        System.out.printf("| %-20s %6.2f | \n", "Sueldo bruto", sueldoBruto);
        System.out.printf("| %-20s %7.2f | \n", "Retencion IRPF(20%)", retencion);
        
      break;
  
    }
    
    System.out.println("|------------------------------|");
    
    neto = sueldoBruto - retencion;
    
    System.out.printf("| %-20s %6.2f | \n", "Sueldo neto", neto);
    
    System.out.println("--------------------------------");
    
  }
}
