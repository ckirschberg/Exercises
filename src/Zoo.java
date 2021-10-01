import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Elephant> elephants = new ArrayList<>();

    public void addElephant(Elephant e) {
        elephants.add(e);
    }
    public void removeElephant() {
        elephants.remove(elephants.size()-1);
    }
    public void allElephantsCharge() {
        for(Elephant currentElephant : elephants) {
            currentElephant.charge();
        }
    }
    public double totalStomping() {
        double total = 0;
        for (Elephant currentElephant : elephants) {
            total += currentElephant.stomp();
        }
        return total;
    }

    public double averageStamina() {
        double totalStamina = 0;
        for (Elephant currentElephant : elephants) {
            currentElephant.setStamina(100);
            currentElephant.charge();
            totalStamina += currentElephant.getStamina();
            System.out.println(currentElephant.getStamina());
        }
        return totalStamina / elephants.size();

    }









}
