package dependencyInversion;

class AccountsPayable{
    private  static AccountsPayable instance = new AccountsPayable();
    static AccountsPayable getInstance() {
        return  instance;
    }

    public void  amPaying(Payable employee){/**/}
}

interface Payable{
    public void pay();

    public static class Implementation implements Payable{
        public void pay(){
            AccountsPayable.getInstance().amPaying(this);
        }
    }
}



public class Demo {
}
