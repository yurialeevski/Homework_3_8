public abstract class Transport {
    private String brand;

    public Transport(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public abstract void makeReady();
}
