import java.util.Currency;
interface Timesheet{}
interface Invoice{}
class MoneyY {
    public MoneyY(double val, Currency c) {

    }
}

abstract class Worker {
    private String name;
    public Worker(String name){
        this.name=name;
    }

    public  void  pay(){/**/}
    abstract protected Money getAmountDue();
}

abstract class Employee extends Worker{
    private Timesheet[] unpaidTimesheets;
    public Employee (String name) {
        super(name);
    }
    public void attachTimesheet(Timesheet i) {}
}

abstract class  Contractor extends Worker{
    public Contractor(String name) {
        super(name);
    }
    private  Invoice[] invoicesDue;
    public void attachInvoice(Invoice i) {}

}

class AccountsPayable{
    Worker[] workers;

    public void PayEverybody(){
        for (Worker worker: workers){
            worker.pay();
        }
    }
}


