
package lista;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import entidades.funcionarios;

public class Lista {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner in = new Scanner(System.in);
       System.out.print("How many employees will be registered? ");
       int n = in.nextInt();
       funcionarios func = new funcionarios();
       List<funcionarios>users = new ArrayList<>();
       
       for(int i=0;i<n;i++){
           System.out.println();
           System.out.println("Employee #"+(i+1)+":");
           System.out.print("Id: ");
           int id = in.nextInt();
           System.out.print("Name: ");
           in.nextLine();
           String name = in.nextLine();
           System.out.print("Salary: ");
           double salary = in.nextDouble();
           func = new funcionarios(id, name, salary);
           users.add(func);
       }
       
       System.out.println();
       System.out.print("Enter the employee id that will have salary increased: ");
       int searchedId = in.nextInt();
       int pos = searchId(users, searchedId);
       if(pos >=0 ){    
            System.out.print("Enter the percentage: ");
            double percentage = in.nextDouble();
            users.get(pos).increaseBalance(percentage);
       }else{
            System.out.print("This id have not exists");
       }
        
       System.out.println(); 
       System.out.println("List of employees: ");
       for(funcionarios neymar: users){
           System.out.println(neymar);
       }
       
      
    }
    
    public static int searchId(List<funcionarios> users, int searchedId){
       funcionarios func;
       for(int i=0; i < users.size(); i++){
           if(users.get(i).getId() == searchedId){
            return i;
         }   
       }  
       return -1;
    }
  }