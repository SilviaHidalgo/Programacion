import java.util.Scanner;

public class Ejercicio13 {
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Este programa ordenará 3 números, escribe el primro");
    
    double num1 = x.nextDouble();
    
    System.out.println("Escribe el segundo:");
     
    double num2 = x.nextDouble();
    
    System.out.println("Escribe el 3:");
     
    double num3 = x.nextDouble();
    
    if (num1>num2 && num1>num3){
      
        if (num2>num3){
          
          System.out.println("El orden de los numeros es "+num1+" "+num2+" "+num3);
          
          }
          
        else{
          
          System.out.println("El orden de los numeros es "+num1+" "+num3+" "+num2);
          
          }
      
      }
      
    if (num2>num1 && num2>num3){
      
      if (num1>num3){
          
          System.out.println("El orden de los numeros es "+num2+" "+num1+" "+num3);
          
          }
          
        else{
          
          System.out.println("El orden de los numeros es "+num2+" "+num3+" "+num1);
          
          }
      
      }  
    
    if (num3>num1 && num3>num2){
      
      if (num1>num2){
          
          System.out.println("El orden de los numeros es "+num3+" "+num1+" "+num2);
          
          }
          
        else{
          
          System.out.println("El orden de los numeros es "+num3+" "+num2+" "+num1);
          
          }
      
      }  
    
    
    }
  }
