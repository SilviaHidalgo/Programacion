import java.util.Scanner;

public class Ejercicio23{
  public static void main (String[] args){
  
  Scanner x = new Scanner(System.in);
  
  int suma = 0;
  int cont = 0;
  double media = 0;
  
  while (suma<=10000){
    
    System.out.print("Escribe un número, sumare los introducidos hasta que superes 10000: ");
    
    int num = x.nextInt();
    
    suma = suma + num;
    cont++;
    
  }
    
  media = suma/cont;
  
  System.out.println("El total acumulado es "+suma);
  
  System.out.println("Se han contado "+cont+" total de números");
  
  System.out.println("La media es "+media);
  
  }
}
