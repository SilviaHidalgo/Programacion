public class Ejercicio15{
  public static void main(String[] args){
    
    int linea = 0;
    int nota = 0;
    int cont = 0;
    String escribir = "";
    String compas = "";
      
    linea = (int)(Math.random()*29)+4;
      
      for ( int i=1; i<=linea;i++){
      
        nota = (int)(Math.random()*7);
        
        switch (nota){
          
          case 0: 
          compas = compas +"do ";
          cont++;
          break;
          
          case 1: 
          compas = compas +"re ";
          cont++;
          break;
          
          case 2: 
          compas = compas +"mi ";
          cont++;
          break;
          
          case 3: 
          compas = compas +"fa ";
          cont++;
          break;
          
          case 4: 
          compas = compas +"sol ";
          cont++;
          break;
          
          case 5: 
          compas = compas +"la ";
          cont++;
          break;
          
          case 6: 
          compas = compas +"si ";
          cont++;
          break;
        
        }
        
        if (cont==4){
        
          escribir = escribir+compas;
          compas = "| ";
          cont= 0;
        
        }
        
   
      
      }
      
      System.out.println(escribir+"||");
      System.out.println(linea);
      
    
    
  
  }
}
