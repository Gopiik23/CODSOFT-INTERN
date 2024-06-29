package TASK3;

public class Bankaccount {
private double balance;
public Bankaccount(double initialbalance){
    this.balance=initialbalance;
}    
public double getbalance(){
    return balance;
}
public void deposit(double amount){
    if(amount > 0){
        balance+= amount;
        System.out.println("Amount successfully Deposited");

    }
    else{
        System.out.println("Invalid amount to Deposit");
    }
}
public void withdraw(double amount){
    if(amount > 0 && amount <= balance){
        balance -= amount;
        System.out.println("Amount withdrawn successfully");
    }
    else{
        System.out.println("Insufficient fund cannot withdraw");
    }
}
}
