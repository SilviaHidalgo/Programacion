import java.util.Scanner;

public class Ejercicio12 {
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("¿En programación de aprende java verdadero o falso?");
    
    boolean respuesta1 = x.nextBoolean();
    
    System.out.println("¿DAW se imparte en el parque tecnologico verdadero o falso?");
     
    boolean respuesta2 = x.nextBoolean();
    
    System.out.println("¿En el curso se utilizan torres verdadero o falso?");
     
    boolean respuesta3 = x.nextBoolean();
    
    System.out.println("¿Tienes que tener tu propio pc obligatoriamente verdadero o falso?");
     
    boolean respuesta4 = x.nextBoolean();
    
    System.out.println("¿Entras a clase a las 8 de la mañana verdadero o falso?");
     
    boolean respuesta5 = x.nextBoolean();
    
    System.out.println("¿Hay alguna cafeteria cerca verdadero o falso?");
     
    boolean respuesta6 = x.nextBoolean();
    
    System.out.println("¿Java se estudia de forma teorica verdadero o falso??");
     
    boolean respuesta7 = x.nextBoolean();
    
    System.out.println("¿En lengaje de marcas aprendeis a hacer paginas web verdadero o falso?");
     
    boolean respuesta8 = x.nextBoolean();
    
    System.out.println("¿Entornos de desarrollo la dais bilingüe verdadero o falso?");
     
    boolean respuesta9 = x.nextBoolean();
    
    System.out.println("¿Te prohiben usar el ordenador durante clase verdadero o falso?");
     
    boolean respuesta10 = x.nextBoolean();
    
    int puntuacion=0;
    
    if (respuesta1==true){
      
      puntuacion++;
      
      }
      
    if (respuesta2==true){
      
      puntuacion++;
      
      }  
    
    if (respuesta3==false){
      
      puntuacion++;
      
      }
    
    if (respuesta4==false){
      
      puntuacion++;
      
      }
      
    if (respuesta5==false){
      
      puntuacion++;
      
      }
    
    if (respuesta6==true){
      
      puntuacion++;
      
      }
    
    if (respuesta7==false){
      
      puntuacion++;
      
      }
    
    if (respuesta8==true){
      
      puntuacion++;
      
      }
      
    if (respuesta9==true){
      
      puntuacion++;
      
      }
      
    if (respuesta10==false){
      
      puntuacion++;
      
      }
    
    System.out.println("Tu puntuación es :"+puntuacion);
    
    }
  }
