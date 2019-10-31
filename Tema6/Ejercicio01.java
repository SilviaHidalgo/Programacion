public class Ejercicio01{
  public static void main (String[] args){
  
    int suma = 0;
    int dado;
    
    System.out.println("Este programa genera 3 tiradas de dados y suma el restultado");
    
    for(int i=0;i<3;i++){
    
      dado =(int) (Math.random()*6)+1;
      
      System.out.println(" El dado ha salido "+dado);
      
      suma = suma + dado;
    
    }
    
    System.out.println("La suma de los dados es "+suma);
  
  
  }
}
