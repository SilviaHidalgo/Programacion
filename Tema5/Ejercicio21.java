import java.util.Scanner;

public class Ejercicio21{
    public static void main(String[] args){
      
      Scanner x = new Scanner(System.in);
      
      boolean bucle = true;
      int suma = 0;
      int mayor = 0;
      int cont = 0;
      int media= 0;
    
      System.out.println("Este programa pedira números hasta que escribas uno negativo, hará la media de los impares y te dirá el mayor de los pares");
    
      while(bucle){
    
        System.out.println("Escribe un número: ");
    
        int num = x.nextInt();
        
        if (num>0){
        
          if (num%2==0){
          
            if(num>mayor){
            
              mayor=num;
            
            }
          
          }
        
          else{
          
            suma = suma + num;
          
            cont++;
          
          }
        }
        
        else{
          
          bucle=false;
        
        }
      }
      
      media = suma/cont;
      
      System.out.println("El mayor numero par es "+mayor);
      
      System.out.println("La media de los impares es "+media);
      
    }
}
