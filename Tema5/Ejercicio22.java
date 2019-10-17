public class Ejercicio22{
    public static void main (String[] args){
      
      int primo;
      int cont = 0;
    
      for (int i=2; i<=100; i++){
        for(int num=2; num<=100; num++){
       
          if(i%num==0){
            cont++;
          }
  
        }
      
        if (cont<2){
        
          System.out.println(i);
        
        }
        
        cont = 0;
      
      }
    
    }
}
