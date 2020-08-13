//import java.util.Currency;
//
//interface Timesheet {
//}
//
//interface Invoice {
//}
//
//interface Payable {
//    void pay();
//}
//
//class Money {
//    public Money(double val, Currency c) {
//
//    }
//}
//
//abstract class Worker implements Payable {
//    private String name;
//
//    public Worker(String name) {
//        this.name = name;
//    }
//
//    public void pay() {
//        Money due = getAmountDue();
//    }
//
//    abstract protected Money getAmountDue();
//}
//
//abstract class Employee extends Worker {
//    private Timesheet[] unpaidTimesheets;
//
//    public Employee(String name) {
//        super(name);
//    }
//
//    public void attachTimesheet(Timesheet i) {
//    }
//
//    protected Money getAmountDue() {
//        return new Money(12.34, Currency.getInstance("USD"));
//    }
//}
//
//abstract class Contractor extends Worker {
//    private Invoice[] invoicesDue;
//
//    public Contractor(String name) {
//        super(name);
//    }
//
//    public void attachInvoice(Invoice i) {
//    }
//
//    protected Money getAmountDue() {
//        return new Money(12.34, Currency.getInstance("USD"));
//    }
//}
//
//class AccountsPayable {
//    Payable[] creditors;
//
//
//    public void PayEverybody() {
//        for (Payable creditor : creditors) {
//            creditor.pay();
//        }
//    }
//}
//
//
