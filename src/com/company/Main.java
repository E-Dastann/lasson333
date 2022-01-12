package com.company;

public class Main {

    public static void main(String[] args) {
BankAccount bankAccount=new BankAccount();
bankAccount.depositSum(20000);
while (true){

    try {
        bankAccount.withDraw(6000);
    } catch (LimitException e) {
        try {
            System.out.println(e.getMassage());
            bankAccount.withDraw(e.getRemainingAmount());
        } catch (LimitException ex) {
        }
        break;
    }

}
    }
}

