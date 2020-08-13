package employee;


interface Payable {
    void pay();

    public static class Implementation implements Payable {
        public void pay() {/*..*/}
    }
}

class Employee extends Payable.Implementation {
}

class Contractor implements Payable {
    private Payable delegate = new Payable.Implementation();

    public void pay() {
        delegate.pay();
    }
}

class Colunteer {
}

class Vendor implements Payable {
    public void pay() {

    }
}

public class Demo {

    public void runDemo() {
        Payable[] workers = new Payable[]{
                new Employee(), new Contractor()};
        doDemo(workers);
    }

    private void doDemo(Payable[] workers) {
        for (Payable w : workers) {
            w.pay();
        }
    }
}


