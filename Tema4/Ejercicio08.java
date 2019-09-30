import java.util.Scanner;

public class Ejercicio08 {
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe la primera nota: ");
    
    float nota1 = x.nextFloat();
    
    Scanner k = new Scanner(System.in);
    
    System.out.println("Escribe la segunda nota: ");
     
    float nota2= k.nextFloat();
     
    Scanner j = new Scanner(System.in);
    
    System.out.println("Escribe la tercera nota: ");
     
    float nota3= j.nextFloat();
    float media;
  
    if ((nota1>=4.5) && (nota2>=4.5) && (nota3>=4.5)){
      
      media = (nota1+nota2+nota3)/3;
      
    }
      
    else{
      
      media = 4;
      
    }  
    
    if(media<5){
      System.out.println("Tienes un insuficiente");
    }
    else{
      
      if(media>=5 && media<6){
        System.out.println("Tienes un suficiente");
      }
      else{
          if(media>=6 && media<8){
            System.out.println("Tienes un bien");
          }
          else{
            if(media<=8 && media<9){
              System.out.println("Tienes un notable");
            }
            else{
              System.out.println("Tienes un sobresaliente");
            }
            
          }
          
      } 
    }    
    
    }
  }
