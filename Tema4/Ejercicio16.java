import java.util.Scanner;

public class Ejercicio16 {
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("¿Tu pareja parece estar más inquieta de lo normal sin ningun motivo aparente?");
    
    boolean respuesta1 = x.nextBoolean();
    
    System.out.println("¿Ha aumentado sus gastos de vestuario?");
     
    boolean respuesta2 = x.nextBoolean();
    
    System.out.println("¿Ha perdido el interés que mostraba antriormente por ti?");
    
    boolean respuesta3 = x.nextBoolean();
    
    System.out.println("¿Ahora se afeita y asea con más frecuencia(si es hombre) o ahorase arregla el pelo y se asea con más frecuaencia(si es mujer?");
     
    boolean respuesta4 = x.nextBoolean();
    
    System.out.println("¿Entras a clase a las 8 de la mañana verdadero o falso?");
     
    boolean respuesta5 = x.nextBoolean();
    
    System.out.println("¿No te deja que mires la agenda de su telefono movil?");
     
    boolean respuesta6 = x.nextBoolean();
    
    System.out.println("¿A veces tiene llamadas que dice no querer contestar cuando estás delante?");
     
    boolean respuesta7 = x.nextBoolean();
    
    System.out.println("¿Muchos días viene tarde después de trabajar porque dice que tiene máś trabajo?");
     
    boolean respuesta8 = x.nextBoolean();
    
    System.out.println("¿Has notado que últimamente se perfuma más?");
     
    boolean respuesta9 = x.nextBoolean();
    
    System.out.println("¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
     
    boolean respuesta10 = x.nextBoolean();
    
    int puntuacion=0;
    
    if (respuesta1==true){
      
      puntuacion= puntuacion + 3;
      
    }
      
    if (respuesta2==true){
      
      puntuacion= puntuacion + 3;
      
    }  
    
    if (respuesta3==true){
      
      puntuacion= puntuacion + 3;
      
    }
    
    if (respuesta4==true){
      
      puntuacion= puntuacion + 3;
      
    }
      
    if (respuesta5==true){
      
      puntuacion= puntuacion + 3;
      
    }
    
    if (respuesta6==true){
      
      puntuacion= puntuacion + 3;
      
    }
    
    if (respuesta7==true){
      
      puntuacion= puntuacion + 3;
      
    }
    
    if (respuesta8==true){
      
        puntuacion= puntuacion + 3;
      
    }
      
    if (respuesta9==true){
      
      puntuacion= puntuacion + 3;
      
    }
      
    if (respuesta10==true){
      
      puntuacion= puntuacion + 3;
      
    }
    
    if (puntuacion<=10){
      
      System.out.println("Enhorabuena tu pareja no te es infiel.");
      
    }
      
    if (puntuacion>=11 && puntuacion<22){
      
      System.out.println("Quizás exista peligro de otra persona en su vida y su mente, pero seguro que no es nada, aunque no bajes la guardia.");
      
    }
      
    if (puntuacion>=22){
      
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.");
      
    }
    
  }
}
