package assignment.DataAbstraction;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
        this.accountNumber = 0;
        this.checkBalance = 0;
        this.savingBalance = 0;
        this.savingRate = 0;
        this.name = null;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();

    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
        this.savingRate = 0;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();

    }

    /**
     * Check the  account get in param is either checking or saving. Add the deposit value
     * to the account passed in param. add the transactions to the arraylist that
     * matches to account. Return Balance. Return -1 represents error.
     * @param amt
     * @param date
     * @param account
     * @return
     */
    public double deposit(double amt, Date date, String account){
        //your code here

            if (account.equals(CHECKING)){
                if (!(amt < 0)) {
                    checkBalance += amt;
                    deposits.add(new Deposit(amt,date, account));
                }
                return checkBalance;
            }else if (account.equals(SAVING)){
                if(!(amt<0)){
                    savingBalance += amt;
                    deposits.add(new Deposit(amt,date, account));
                }
                return savingBalance;
            }else{
                return 0;
            }
        }

    /**
     * check the withdraw amounts are either overdraft or not. If it is, return -1.
     * Error also return -1.If not, return balance.
     * If the account is saving, deduct the saving with amt,else deduct checking with amt.
     * @param amt
     * @param date
     * @param account
     * @return
     */
    public double withdraw(double amt, Date date, String account){
        //your code here
            if (checkOverdraft(amt,account)){
                if (account.equals(CHECKING)){
                    if(amt>0){
                        checkBalance -= amt;
                        withdraws.add(new Withdraw(amt, date, account));
                    }
                    return checkBalance;
                }else if (account.equals(SAVING)){
                    if(amt>0){
                        savingBalance -= amt;
                        withdraws.add(new Withdraw(amt, date, account));
                    }
                    return savingBalance;
                }else{
                    return 0;
                }
            }else{
                return 0;
            }
        }

    /**
     * The method checks the amount of withdraw is overdraft or not. If it is,
     * return false. If it is not, return ture.
     * @param amt
     * @param account
     * @return
     */
    private boolean checkOverdraft(double amt, String account){
        //your code here
        if (account.equals(CHECKING)){
            if((checkBalance - amt) < OVERDRAFT){
                return false;
            } else{
                return true;
            }
        }else if(account.equals(SAVING)){
            if ((savingBalance - amt) < OVERDRAFT){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }



    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}