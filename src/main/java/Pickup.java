public class Pickup extends Transport {
    private Integer productionYear;

    public Pickup(String brand, Integer productionYear) {
        super(brand);
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "brand=" + getBrand() +
                " productionYear=" + productionYear +
                '}';
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }
    @Override
    public void makeReady() {
        System.out.println(getBrand() + " готов к работе");
    }
}
