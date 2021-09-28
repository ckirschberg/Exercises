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
        double result = 100 - weight/1000;
        System.out.println("Yeehaaaa topspeed is " + result);
    }
}
