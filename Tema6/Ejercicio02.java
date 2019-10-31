public class Ejercicio02{
  public static void main (String[] args){
  
    int palo;
    String paloLetras = "";
    String cartaLetra;
    int carta;
    
    System.out.println("Este programa hecha cartas");
    
    
    
      palo = (int) (Math.random()*4)+1;
      carta = (int) (Math.random()*13)+1;
      
      switch (palo){
      
        case 1:
          paloLetras = "Picas";
        break;
        
        case 2:
          paloLetras = "Corazones";
        break;
        
        case 3:
          paloLetras = "Diamantes";
        break;
        
        case 4:
          paloLetras = "Treboles";
        break;
        
        default:
  
      }
      
      switch (carta){
      
        case 1:
          cartaLetra = "A";
        break;
        
        case 11:
          cartaLetra = "J";
        break;
        
        case 12:
          cartaLetra = "Q";
        break;
        
        case 13:
          cartaLetra = "K";
        break;
        
        default:
          cartaLetra =""+carta;
  
      }
      
      
    
    
    
    System.out.println("Has sacado "+cartaLetra+" de "+paloLetras);
  
  
  }
}
