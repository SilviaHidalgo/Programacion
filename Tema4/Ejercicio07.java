import java.util.Scanner;

public class Ejercicio07 {
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe la primera nota: ");
    
    float nota1 = x.nextFloat();
    
    System.out.println("Escribe la segunda nota: ");
     
    float nota2= x.nextFloat();
    
    System.out.println("Escribe la tercera nota: ");
     
    float nota3= x.nextFloat();
    float media;
  
    if ((nota1>=4.5) && (nota2>=4.5) && (nota3>=4.5)){
      
      media = (nota1+nota2+nota3)/3;
      
      System.out.println("Tu nota media es de "+media);
      
      }
      
    else{
      
      System.out.println("No puedes hacer media con una nota inferiror a 4.5");
      
      }  
    
    }
  }
