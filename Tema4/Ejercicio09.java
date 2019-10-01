import java.util.Scanner;

public class Ejercicio09 {
  public static void main (String[] args){
    
    System.out.println("Este programa resuelve ecuaciones de segundo grado");
    
    Scanner w = new Scanner(System.in);
    
    System.out.println("Escribe el valor de a: ");
    
    double a = w.nextDouble();
    
    System.out.println("Escribe el valor de b: ");
     
    double b= w.nextDouble();
    
    System.out.println("Escribe el valor de c: ");
     
    double c= w.nextDouble();
    double x;
    double x2;
    double raiz;
  
    if (a!=0){ 
      
        if((b*b)+(-4*a*c)>=0){
          
        raiz=Math.sqrt((b*b)+(-4*a*c));
        x=(-b+raiz)/(2*a);
        x2=(-b-raiz)/(2*a);
        
        System.out.println("El valor de x es igual a: "+x+" y "+x2);
        
        }
        
        else{
          
          System.out.println("La raiz cuadrada es negativa así que no se puede resolver");
          
          }
      
    }
      
    else{
      
      System.out.println("No seria una ecuación de segundo grado");
      
    }  
  
    
    }
  }
