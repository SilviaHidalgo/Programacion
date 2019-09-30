import java.util.Scanner;

public class convertidor { 
  public static void main(String[] args){
    
    Scanner x = new Scanner(System.in);
  
    System.out.println ("Escribe la cantidad en bytes: ");
  
    long dato = x.nextLong();
    long b;
    long kb;
    long mb;
    long gb;
    long aux;
    
    b=dato%1024;
    aux=dato/1024;
    kb=aux%1024;
    aux=aux/1024;
    mb=aux%1024;
    gb=aux/1024;
    
   
    System.out.println("La conversión es: "+gb+"GB "+mb+"MB "+kb+"KB "+b+"B");
    
  }
}
