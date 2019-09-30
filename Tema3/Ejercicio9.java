import java.util.Scanner;

public class Ejercicio9 { 
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe el radio y la altura separados por un espacio y en centimetros, para calcular el volumen:  ");
  
    int radio = x.nextInt();
    int altura = x.nextInt();
    
    
   
    System.out.println("El volumen es: "+((3.14*((double)radio*radio)*altura)/3)+" centimetroscubicos");
    
  }
}
