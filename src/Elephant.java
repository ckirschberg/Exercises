import java.util.Random;

public class Elephant {
    private String name;
    private double weight;
    private boolean isAngry;
    private int stamina; // = 100;

    public Elephant(String name, double weight, boolean isAngry) {
        this.name = name;
        this.weight = weight;
        this.isAngry = isAngry;
        this.stamina = 100;
    }

    public double stomp() {
        return 300 + weight*3;
    }
    public void charge() {
        Random rand = new Random(); //instance of random class
        int int_random = rand.nextInt(11);

        //this.stamina = stamina - int_random;
        setStamina(stamina - int_random);
        //setStamina(getStamina() - int_random);

        double result = 100 - weight/1000;
        System.out.println("Yeehaaaa topspeed is " + result);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
