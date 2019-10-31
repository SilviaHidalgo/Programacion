public class Ejercicio05{
  public static void main (String[] args){
    
    int num;
    int max = 100;
    int min = 199;
    int suma = 0;
    int media = 0;
    
    for(int i=0;i<50;i++){
    
      num = (int)(Math.random()*100)+100;
      
      System.out.print(num+"  ");
      
      suma = suma + num;
      
      if(num<min){
      
        min = num;
        
      }
      
      if(num>max){
      
        max = num;
      
      }
    
    }
    
    media = suma /50;
    
    System.out.println("");
    System.out.print("El numero mínimo es: "+min+"\n");
    System.out.print("El numero máxima es: "+max+"\n");
    System.out.print("La media es: "+media);
    
  }
}
