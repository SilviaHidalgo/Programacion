import java.util.Scanner;

public class Ejercicio4 { 
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe la base y la altura del rectángulo en centímetros separados por un espacio: ");
  
    int dato1 = x.nextInt();
    int dato2 = x.nextInt();
    
   
    System.out.println("La suma de "+dato1+" y "+dato2+" es: "+(dato1+dato2));
    System.out.println("La resta de "+dato1+" y "+dato2+" es: "+(dato1-dato2));
    System.out.println("La multiplicación de "+dato1+" y "+dato2+" es: "+(dato1*dato2));
    System.out.println("La división de "+dato1+" y "+dato2+" es: "+((double)dato1/(double)dato2));
  
  }
}
