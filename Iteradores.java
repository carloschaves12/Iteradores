package iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Iteradores {

  public static void main(String[] args) {
    
    System.out.println("Introduce el numero hasta el que vamos a sacar los numeros primos:");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    List<Integer> listaPrimos = new ArrayList<>();
    for(int i = 0; i <= n; i++) {
      if(esPrimo(i)){
        listaPrimos.add(i);
      } 
    }
    
    Iterator<Integer> iterador = listaPrimos.iterator();
    while(iterador.hasNext()) {
      System.out.println(iterador.next());
    }
  }

  private static boolean esPrimo(int x) {
    for(int i = 2; i < x; i++) {
      if((x%i)==0) {
        return false;
      }
    }
    return true;
  }

}
