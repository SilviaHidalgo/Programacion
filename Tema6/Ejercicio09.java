public class Ejercicio09{
  public static void main(String[] args){
  
    boolean salir = true;
    int cont = 0;
    
    while(salir){
    
      int num = (int)(Math.random()*100)+1;
      
      if( num == 24){
        
        System.out.print(num);
        
        cont++;
        
        salir = false;
      
      }
      
      else{
        
        if(num%2==0){
      
          System.out.print(num+(" - "));
          
          cont++;
        
        }
      
      }
    
    }
  
    System.out.println("");
    System.out.print(("Se han generado "+cont+" números"));
  
  }
}
