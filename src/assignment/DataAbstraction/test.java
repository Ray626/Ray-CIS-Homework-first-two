package assignment.DataAbstraction;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import java.util.Date;
import static org.junit.Assert.*;

public class test {
    @Rule
    public ErrorCollector testDA= new ErrorCollector();

    @Test
    public void testDeposit(){
        Date date = new Date();
        Customer tD= new Customer();
        double tD1 = 0;
        for(int i = 0; i< 10; i++){
            tD1 = tD.deposit(i-1,date,"Checking");
        }
        assertEquals(36,tD1,0);

        double tD2 = tD.deposit(-101,date,"Checking");
        assertEquals(36,tD2,0);

        double tD3 = tD.deposit(1001, date,"Saving");
        assertEquals(1001,tD3,0);

        double tD4 = 0;
        for(int i = 0; i< 5; i++){
            tD4 = tD.deposit(i+100,date,"Saving");
        }
        assertEquals(1511,tD4,0);
    }

    @Test
    public void testWithdraw(){
        Date date = new Date();
        Customer tW = new Customer("Ray",1234567,0,500);
        double tW1 = tW.withdraw(100,date,"Saving");
        assertEquals(400,tW1,0);
        double tW2 = tW.withdraw(-100,date,"Saving");
        assertEquals(400,tW2,0);
        double tW3= tW.withdraw(600,date,"Saving");
        assertEquals(0,tW3,0);
    }
    @Test
    public void testDepositToString(){
        Date date = new Date();
        Deposit tDTS = new Deposit(400,date,"Saving");
        assertEquals("Deposit of: $" + 400.0 + "Date: " + date + " into account: Saving",tDTS.toString());
    }
    @Test
    public void testWithdrawToString(){
        Date date = new Date();
        Withdraw tWTS = new Withdraw(2333333333333333333L,date,"Checking");
        assertEquals("Withdraw of: $" + 2333333333333333333.0 + "Date: " + date + " from account: Checking",tWTS.toString());
    }

}


