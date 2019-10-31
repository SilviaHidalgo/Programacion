public class Ejercicio03{
  public static void main (String[] args){
  
    int palo;
    String paloLetras = "";
    String cartaLetra;
    int carta;
    
    System.out.println("Este programa hecha cartas");
    
    
    
      palo = (int) (Math.random()*4)+1;
      carta = (int) (Math.random()*10)+1;
      
      switch (palo){
      
        case 1:
          paloLetras = "Bastos";
        break;
        
        case 2:
          paloLetras = "Espadas";
        break;
        
        case 3:
          paloLetras = "Oros";
        break;
        
        case 4:
          paloLetras = "Copas";
        break;
        
        default:
  
      }
      
      switch (carta){
        
        case 8:
          cartaLetra = "Sota";
        break;
        
        case 9:
          cartaLetra = "Caballo";
        break;
        
        case 10:
          cartaLetra = "Rey";
        break;
        
        default:
          cartaLetra =""+carta;
  
      }
      
      
    
    
    
    System.out.println("Has sacado "+cartaLetra+" de "+paloLetras);
  
  
  }
}
