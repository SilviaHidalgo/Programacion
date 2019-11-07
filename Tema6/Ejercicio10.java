public class Ejercicio10{
  public static void main(String[] args){
    
    int linea = 0;
    int caracteres = 0;
    String escribir = "";
  
    for (int i=0; i<10; i++){
      
      linea = (int)(Math.random()*40)+1;
      
      for ( int j=0; j<linea;j++){
      
        caracteres = (int)(Math.random()*6);
        
        switch (caracteres){
          
          case 0: 
          escribir = escribir +"*";
          break;
          
          case 1: 
          escribir = escribir +"-";
          break;
          
          case 2: 
          escribir = escribir +"=";
          break;
          
          case 3: 
          escribir = escribir +".";
          break;
          
          case 4: 
          escribir = escribir +"|";
          break;
          
          case 5: 
          escribir = escribir +"@";
          break;
        
        
        }
      
      }
      
      System.out.println(escribir);
      
      escribir = "";
    
    
    }
  
  }
}
