package TASK3;

import java.util.Scanner;

public class Atm {
    private Bankaccount account;
    public Atm(Bankaccount account)
    {
        this.account=account;
    }
    public void display(){
        System.out.println("WELCOME TO THE ATM ");
        System.out.println("1.CHECK BALANCE");
        System.out.println("2.DEPOSIT");
        System.out.println("3.WITHDRAW");
        System.out.println("4.EXIT");
    }
    public void start(){
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("Choose an option..");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    checkbalance();
                    break;
                case 2:
                    deposit(in);
                break;
                case 3:
                    withdraw(in);
                    break;
                case 4:
                exit = true;
                break;
                default:
                System.out.println("INVALID OPTION..");
                    break;
            }
        }
    }
     public void checkbalance(){
            System.out.println("CURRENT BALANCE : "+account.getbalance());

        }
        public void deposit(Scanner in){
            System.out.println("ENTER DEPOSIT AMOUNT : ");
            double amount =in.nextDouble();
            account.deposit(amount);
        }
        public void withdraw(Scanner in){
            System.out.println("ENTER AMOUNT TO WITHDRAW : ");
            double amount = in.nextDouble();
            account.withdraw(amount);
                
        
        }

    public static void main( String[] args)
    {
        Bankaccount userBankaccount = new Bankaccount(1000);
        Atm atm = new Atm(userBankaccount);
        atm.display();
        atm.start();
            
        
    }
}
