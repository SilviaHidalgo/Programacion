

public class Ejercicio01{
  public static void main (String[] args){
    
    
    
    System.out.println("Escribe el día de la semana en número del que quieras conocer la primera hora: ");
    
    int dia = Integer.parseInt(System.console().readLine());
    String asignatura;
    
    
    switch(dia){
      
      case 1:
      asignatura = "Entornos de desarrollo";
      break;
      
      case 2:
      asignatura = "Programación";
      break;
      
      case 3:
      asignatura = "Programacion";
      break;
      
      case 4:
      asignatura = "Programacion";
      break;
      
      case 5:
      asignatura = "Horas de libre configuración";
      break;
      
      default:
      asignatura = "No es ningún día de la semana lectiva, escribe entre el 1 y el 5";
    }
    
    System.out.println("Ese día a primera hora hay "+ asignatura );
  
  }
}
