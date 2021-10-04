public class BikeRepairShop {
    public static void main(String[] args) {
        Bike b1 = new Bike("Suzuki", 1.2, 2.4, 1.5);
        Bike b2 = new Bike("Puki", 0.9, 2.2, 1.1);
        Bike b3 = new Bike("Yamaha", 1.4, 2.7, 1.6);
        Bike b4 = new Bike("Jasmins bike", 1.4, 2.7, 1.6);

        BikeRepairShop shop = new BikeRepairShop();
        shop.startRepair(b1, 0);
        //shop.startRepair(b2, 1);
        shop.startRepair(b3, 2);

        //for(int i=0; i < shop.getBikes().length; i++) {
        //    shop.getBikes()[i].print();
        //}
        shop.printBikes();

        shop.startRepair(b4, 3);

        int totalBikes = BikeRepairShop.getTotalBikesRepaired();
        System.out.println(totalBikes);
        if (totalBikes > 10) {
            System.out.println("Good work people");
        } else {
            System.out.println("Do more work lazy employees!");
        }

        shop.printBikes();
    }

    private Bike[] bikesInShop = new Bike[3];
    private static int totalBikesRepaired = 0;

    private static int getTotalBikesRepaired() {
        return totalBikesRepaired;
    }

    private Bike[] getBikes() {
        return bikesInShop;
    }

    public void printBikes() {
        for(int i=0; i < bikesInShop.length; i++) {
            try {
                bikesInShop[i].print();
            } catch (NullPointerException e) {
                System.out.println("No bike on position " + i);
            }
        }
    }

    public void startRepair(Bike b, int index) {
        try {
            bikesInShop[index] = b;
            totalBikesRepaired++;
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(index + " is outside of the bounds of the array");

        }
    }
}
