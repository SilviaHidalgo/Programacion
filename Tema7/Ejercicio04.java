public class Ejercicio04{
  public static void main(String [] args){
   
    int[] numero = new int [20];
    int[] cuadrado = new int [20];
    int[] cubo = new int [20];
    

    
    for(int i=1;i<20;i++){
      
      numero[i]=(int)(Math.random()*101);
      
      cuadrado[i]= numero[i]*numero[i];
      
      cubo[i]=cuadrado[i]*numero[i];
    
    }
    
    System.out.printf("%10s %10s %10s \n", "Número", "Cuadrado", "Cubo");
    
    for (int i=1;i<20;i++){
    
      System.out.printf("%10d %10d %10d \n", numero[i], cuadrado[i], cubo[i]);
    
    }   
    
  }
}
