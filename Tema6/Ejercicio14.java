import java.util.Scanner;

public class Ejercicio14{
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Piensa un número intentaré adivinarlo:");
    
    int num= 0;
    int maximo = 100;
    int minimo = 0;
    int intentos = 5;
    boolean salir = true;
    
    
    do{
      
      num=(int) (Math.random()*(maximo-minimo)+minimo);
      
      System.out.println("¿Es este "+num+" tu numero? ");
      String respuesta1 = x.next();
      
      if (respuesta1.equals("no")){
        
        System.out.println("¿Tu número es mayor o menor?");
        String respuesta2 = x.next();
        
        if (respuesta2.equals("mayor")){
          
         minimo = num +1;
        }
        
        else{
        
          maximo = num - 1;
        
        }
        
        intentos--;
        
      }
      
      else{
        
        intentos = 0;
      
      }
      
      
    
    }while (intentos>=1);
  
  }
}
