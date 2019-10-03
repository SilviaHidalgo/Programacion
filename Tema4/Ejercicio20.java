import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe un numero entero de máximo 5 cifras y te dire si es capicudo:");
    
      int numero = x.nextInt();
      numero = Math.abs(numero);
      int primeraCifra = 0;
      int ultimaCifra = 0;
      
    if(numero<10){
      
      System.out.println("Un solo digito no puede ser capicudo");
      
      }
      
    else{
      
      if(numero<100){
        
        primeraCifra = (int)(numero*0.1);
        
        ultimaCifra= numero%10;
        
      }
      
      else{
        
        if(numero<1000){
          
          primeraCifra = (int)(numero*0.01);
          
          ultimaCifra= numero%10;
          
        
        }
        
        else{
          
          if (numero<10000){
            
            primeraCifra = (int)(numero*0.001);
            
            ultimaCifra= numero%10;
            
          }
          
          else{
            
            if (numero<100000){
              
              primeraCifra = (int)(numero*0.0001);
              
              ultimaCifra= numero%10;
              
            }
              
            else {
              
              System.out.println("Es un numero superior a 5 cifras");
              
            }  
          }
        }
      }
        
    }
      
    if (primeraCifra==ultimaCifra){
      
      System.out.println("Este numero es capicudo");
      
    }
      
    else{
      
      System.out.println("Este numero no es capicudo");
      
    }
      
  }
}
