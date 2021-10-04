public class Bike {
    private String brand;
    private double width;
    private double length;
    private double height;

    public Bike(String brand, double width, double length, double height) {
        this.brand = brand;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void print() {
        System.out.println(brand + " w: " + width + " l: " + length + " h: " + height);
    }
    public double calculateProduct() {
        return width * length * height;
    }
}
