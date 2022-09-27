package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$2_ObjectArray.Demo3;

/*
    定义手机类
 */

public class Iphone {
    private String brand;
    private int price;
    private String color;
    
    public Iphone() {}
    
    public Iphone (String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
