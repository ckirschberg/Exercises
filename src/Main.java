public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Christian", 100.24);

        b1.deposit(1000.2);
        System.out.println(b1.getBalance());
        b1.withdraw(1);
        System.out.println(b1.getBalance());

        Bank bank1 = new Bank();
        bank1.addAccount(b1);
        bank1.addAccount(new BankAccount("Emie", 100000));
        bank1.addAccount(new BankAccount("Zaland", 1000));
        bank1.addAccount(new BankAccount("Balasz", 20000));
        bank1.addAccount(new BankAccount("Brian", 35000));

        System.out.println("Total value is: " + bank1.totalValue());


        Elephant e1 = new Elephant("Brian", 4500, false);
        Elephant e2 = new Elephant("Lise", 6500, true);
        Elephant e3 = new Elephant("Berit", 2500, false);
        System.out.println("stomping pressure is: " + e1.stomp());
        //e1.charge();

        Zoo zoo = new Zoo();
        zoo.addElephant(e1);
        zoo.addElephant(e2);
        zoo.addElephant(e3);

        System.out.println("Stamina:");
        System.out.println(e1.getStamina());
        //e1.charge();
        System.out.println(e1.getStamina());


        zoo.allElephantsCharge();
        System.out.println(zoo.averageStamina());




    }
}
