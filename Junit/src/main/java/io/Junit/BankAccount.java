package io.Junit;


public class BankAccount {
    public int withdraw(int Withdraw) throws InsufficientFundsException{
        int balance=9000;
        if(Withdraw>9000){
            throw new InsufficientFundsException("insufficient balance");
        }
        else {
            System.out.println(balance=balance-Withdraw);
        }

        return balance;
    }

}
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){

        super(message);
    }
}