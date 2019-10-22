import java.util.Scanner;

public class Ejercicio30{
  public static void main (String[] args){
    
    Scanner x = new Scanner(System.in);
    
    int numDiap = 0;
    int numDias = 0;
    int suma;
    boolean correcto = true;
    
    
    do{
  
      System.out.println("Por favor escriba una hora: ");
    
      System.out.print("Dia: ");
  
      String diap = x.next();
    
      System.out.print("Hora: ");
    
      int horap = x.nextInt();
      
      System.out.println("");
    
      System.out.println("Por favor introduzca la siguiente hora: ");
    
      System.out.print("Día: ");
    
      String dias = x.next();
    
      System.out.print("Hora: ");
    
      int horas = x.nextInt();
      
      System.out.println("");
    
      
      switch(diap){
      
        case "lunes":
        case "1":
        numDiap = 1;
        break;
        
        case "martes":
        case "2":
        numDiap = 2;
        break;
        
        case "miercoles":
        case "3":
        numDiap = 3;
        break;
        
        case "jueves":
        case "4":
        numDiap = 4;
        break;
        
        case "viernes":
        case "5":
        numDiap = 5;
        break;
        
        case "sabado":
        case "6":
        numDiap = 6;
        break;
        
        case "domingo":
        case "7":
        numDiap = 7;
        break;
      
      }
      
      switch(dias){
      
        case "lunes":
        case "1":
        numDias = 1;
        break;
        
        case "martes":
        case "2":
        numDias = 2;
        break;
        
        case "miercoles":
        case "3":
        numDias = 3;
        break;
        
        case "jueves":
        case "4":
        numDias = 4;
        break;
        
        case "viernes":
        case "5":
        numDias = 5;
        break;
        
        case "sabado":
        case "6":
        numDias = 6;
        break;
        
        case "domingo":
        case "7":
        numDias = 7;
        break;
        
      
      }
      
      
        if(numDiap<=numDias){
      
          System.out.println("El día introducido no es correcto. Deben ser diferentes.");
      
        }
        
        else{
      
          if (horap<0 || horap>23 || horas<0 || horas>23){
    
            System.out.println("La hora introducida no es correcta. Las horas son entre 0 y 23.");
    
          }
      
          else{
      
            suma = ((numDias*24)+horas)-((numDiap*24)+horap);
      
            System.out.println("Hay "+suma+" horas");
            
            correcto = false;
      
          }
        }
    
    }
    while(correcto);
  
  }
}
