public class Ejercicio10{
  public static void main(String[] args){
      
    int [] num = new int [20];
    int [] ordenado = new int [20];
    int j = 0;
    int par = 0;
    
    for (int i=0; i<20; i++){
    
      num[i] = (int)(Math.random()*101);
      
      System.out.print(num[i]+" ");
      
      if(num[i]%2==0){
      
        par++;
      
      }
    
    }
    
    System.out.println("\n");
    
    
    for (int i=0; i<20; i++){
      
      if(num[i]%2==0){
        
        ordenado[j] = num[i];
        j++;
      
        }
    
    }
    
    j=par;
    
    for(int i=0; i<20; i++){
    
      if(num[i]%2!=0){
      
        ordenado[j] = num[i];
        j++;
      
      }
    
    }
    
    for(int i=0; i<20; i++){
    
      System.out.print(ordenado[i]+" ");
    
    }
    
    
  }
}
