import java.util.Scanner;

public class ATM_MACHINE{
    public static void main(String args[]){
        ATM obj = new ATM();
    } 
}

class Data {
    int balance;
}

class ATM {
    int user_pin=1964;
    Scanner sc=new Scanner(System.in);
    ATM() {
        System.out.println("Welcome to the ATM!");
        operation();
    }

    public void operation(){
        System.out.println("Enter your PIN:");
        int pin=sc.nextInt();

        if(pin == user_pin){
            Data obj=new Data();
            obj.balance=0;
            menu(obj);
        }
        else{
            System.out.println("Invalid PIN!");
            System.exit(0);
        }
    }

    public void menu(Data obj) {
        System.out.println("Enter your choice");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        
        int ch=sc.nextInt();

        if(ch==1){
            check_balance(obj);
        }
        else if(ch == 2){
            withdraw(obj);
        }
        else if(ch == 3){
            deposit(obj);
        }
        else if(ch == 4){
            System.out.println("Thank You for choosing our ATM!");
            System.exit(0);
        }
        else{
            System.out.println("Enter valid option!");
        }
    }

    public void check_balance(Data obj){
        System.out.println("Your Current balance is-" + obj.balance);
        menu(obj);
    }

    public void deposit(Data obj){
        System.out.println("Enter the Amount:");
        float amount=sc.nextFloat();
        obj.balance+=amount;
        System.out.println("Amount Deposited Successfully!!.");
        menu(obj);
    }

    public void withdraw(Data obj){
        System.out.println("Enter the Amount:");
        float amount=sc.nextFloat();
        if(amount < obj.balance){
            obj.balance-=amount;
            System.out.println("Amount Withdrawn Successfully!!.");
            menu(obj);
        }
        else{
            System.out.println("Insufficient Balance!.Money cannot be withdrawn!.");
            menu(obj);
        }
        
    }

}