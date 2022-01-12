package com.company;

public class BankAccount {
    private double amount;



    public double getAmount() {
        return amount;
    }
    public  void depositSum (double sum){
        amount+=sum;
        System.out.println("вы пополнили счет на "+sum);



    }
    public void withDraw(double sumBANK) throws LimitException {
        if (sumBANK>amount) {
        throw new LimitException("на вашем счету осталось "+amount, amount);

        }
        else  {
            amount-=sumBANK;
            System.out.println("вы сняли свой счет"+ sumBANK);
        }
        }

    }

