public class Ejercicio13{
  public static void main(String[] args){
    
    System.out.println("Este programa lanzará 2 dados hasta que los números coincidan:");
    
    int dadoP = 0;
    int dadoS = 0;
    boolean salir = true;
    
    do{
      
      dadoP=(int)(Math.random()*6)+1;
      dadoS=(int)(Math.random()*6)+1;
      
      System.out.println("El primer dado ha sacado un "+dadoP);
      System.out.println("El segundo dado ha sacado un "+dadoS);
      System.out.println("");
      
      if (dadoP==dadoS){
        
        salir = false;
      
      }
    
    }while (salir);
  
  }
}
