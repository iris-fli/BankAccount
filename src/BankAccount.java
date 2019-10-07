import java.util.ArrayList;
import java.util.Collections;

public class BankAccount extends Measurable {
    //    change public to private of the data members
    private float balance;
    private float rate;


    public BankAccount(float balance, float rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public BankAccount(float rate) {
        this.balance = 0;
        this.rate = rate;

    }

    public float getMeasure(){
        float accountMeasure = this.balance;
        return accountMeasure;
    }


    public static void main(String [] args) {

        BankAccount account0 = new BankAccount(1000, .1f);
        BankAccount account1 = new BankAccount(.1f);
        BankAccount account2 = new BankAccount(1000, .2f);
        BankAccount account3 = new BankAccount(1000, .3f);
        account3.getMeasure();
//            System.out.println(account0.compareTo(account1));
        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(account0);
        list.add(account2);
        list.add(account3);
        Collections.sort(list);
        System.out.println(BankAccount.average(list));
    }


}

