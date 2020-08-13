import java.util.Currency;
interface Timesheet{}
interface Invoice{}
class MoneyY {
    public MoneyY(double val, Currency c) {

    }
}

class Worker {
    private String name;
    public Worker(String name){
        this.name=name;
    }

    public  void  pay(){/**/}
}

class AccountsPayable{
    Worker[] workers;

    public void PayEverybody(){
        for (Worker worker: workers){
            worker.pay();
        }
    }
}

public class Employee {
}
