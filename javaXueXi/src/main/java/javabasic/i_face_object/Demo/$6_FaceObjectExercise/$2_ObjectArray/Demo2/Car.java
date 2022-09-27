package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$2_ObjectArray.Demo2;
/*
    定义汽车对象
 */
public class Car {
    private String brand;
    private int price;
    private String color;
    
    public Car() {}
    
    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    
    // get / set 方法
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getBrand () {
        return this.brand;
    }
    
    public void setPrice (int price) {
        this.price = price;
    }
    
    public int getPrice () {
        return this.price;
    }
    
    public void setColor (String color) {
        this.color = color;
    }
    
    public String getColor () {
        return this.color;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
