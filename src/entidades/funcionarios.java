
package entidades;


public class funcionarios {
    private int id;
    private String name;
    private double balance;
    
    public funcionarios(){
        
    }
    
    public funcionarios(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void increaseBalance(double percentage){
        balance += balance * (percentage * 0.01);
    }
    
    public String toString(){
        return id+", "+name+", "+String.format("%.2f",balance);
    }
}
