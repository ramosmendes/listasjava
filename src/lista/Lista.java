
package lista;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       List<String>users = new ArrayList<>();
       int n;
       
       do {
           System.out.print("Digite um nome: ");
           String name = in.nextLine();
           users.add(name);           
           System.out.print("Digite 1 para continuar: ");
           n = in.nextInt();
           in.nextLine();
       }while(n == 1);
       
       System.out.println();
       System.out.println(users.size()+" usuários foram cadastrados: ");
       
       for(String neymar : users){
           System.out.println("-"+neymar.toUpperCase());
       }
    }
    
}
