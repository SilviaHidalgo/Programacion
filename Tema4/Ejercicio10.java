import java.util.Scanner;

public class Ejercicio10 {
  public static void main (String[] args){
    
    System.out.println("Este programa te dice que horoscopo eres");
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Escribe tu día de nacimiento: ");
    
    int dia = x.nextInt();
    
    System.out.println("Escribe tu mes de nacimiento: ");
     
    int mes = x.nextInt();
     
  
    if ((dia>=21 && mes==3) || (dia<=20 && mes==4)){
      System.out.println("Eres aries.");
      }
      
    else{
      
      if((dia>=21 && mes==4) || (dia<=20 && mes==5)){
        System.out.println("Eres Tauro");
        }
      
      else{
        
        if((dia>=21 && mes==5) || (dia<=24 && mes==6)){
          System.out.println("Eres Géminis");
          }
          
        else{
        
          if((dia>=25 && mes==6) || (dia<=22 && mes==7)){
            System.out.println("Eres Cáncer");
          }
          
          else{
        
            if((dia>=23 && mes==7) || (dia<=23 && mes==8)){
              System.out.println("Eres Leo");
            }
            
            else{
        
              if((dia>=24 && mes==8) || (dia<=23 && mes==9)){
                System.out.println("Eres Virgo");
              }
              
              else{
        
                if((dia>=24 && mes==9) || (dia<=22 && mes==10)){
                  System.out.println("Eres Libra");
                }
                
                else{
        
                  if((dia>=23 && mes==10) || (dia<=22 && mes==11)){
                    System.out.println("Eres Escorpio");
                  }
                  
                  else{
        
                    if((dia>=22 && mes==11) || (dia<=21 && mes==12)){
                      System.out.println("Eres Sagitario");
                    }
                    
                    else{
        
                      if((dia>=22 && mes==12) || (dia<=19 && mes==1)){
                        System.out.println("Eres Capricornio");
                      }
                      
                      else{
        
                        if((dia>=20 && mes==1) || (dia<=18 && mes==2)){
                          System.out.println("Eres Acuario");
                        }
                        
                        else{
        
                          if((dia>=19 && mes==2) || (dia<=20 && mes==3)){
                            System.out.println("Eres Piscis");
                          }
        
        }
        
        }
        
        }
        
        }
        
        }
              
        
        }
        
        }
        
        }
        
        }
        
        }
      
      }  
    
    }
  }
