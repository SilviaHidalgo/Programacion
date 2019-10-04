import java.util.Scanner;

public class Ejercicio25 {
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Introduce la altura de la bandera (cm):");
     
      int alto = x.nextInt();
    
    System.out.println("Introduce el ancho (cm): ");
    
      int ancho = x.nextInt();
      
    System.out.println("¿Quiere escudo borado?(s/n): ");
    
      String bordado = x.next();
    
    System.out.println("Gracias, aquí tiene desglosada su compra.");
    
    int area = alto * ancho;
    double envio = 3.25;
    double escudo;
    double precio = (double)area/100;
    double total;
    
    if (bordado.equals("s")){
      
      escudo=2.50;
      
    }
      
    else{
      
      escudo=0;
      
    }
    
    total = precio + escudo + envio;
    
    System.out.printf(" %-20s %6.2f %6s \n", "Bandera de "+area+" cm2:", precio, "euros");
    
    System.out.printf(" %-20s %6.2f %6s \n", "Con escudo:", escudo, "euros");
    
    System.out.printf(" %-20s %6.2f %6s \n", "Gastos de envío:", envio, "euros");
    
    System.out.printf(" %-20s %6.2f %6s  \n", "Total:", total, "euros");
  }
}
