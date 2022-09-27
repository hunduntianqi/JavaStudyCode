package javabasic.k_ArrayList.Demo.$1_ArrayListTraverse;

public class $3_Phone {
    private String brand;
    private double price;
    
    public $3_Phone() {
    }
    
    public $3_Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "$3_Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
