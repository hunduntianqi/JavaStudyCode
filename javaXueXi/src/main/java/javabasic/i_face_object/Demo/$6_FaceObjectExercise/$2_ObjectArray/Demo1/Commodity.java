package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$2_ObjectArray.Demo1;

/*
    创建商品类
 */

import java.util.Objects;

public class Commodity {
    private int id;
    private String name;
    private double price;
    private int count;
    
    public Commodity() {}
    
    public Commodity (int id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }
    
    public void setId (int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName () {
        return this.name;
    }
    
    public void setPrice (double price) {
        this.price = price;
    }
    
    public double getPrice () {
        return this.price;
    }
    
    public void setCount () {
        this.count = count;
    }
    
    public int getCount () {
        return this.count;
    }
    
    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commodity commodity)) return false;
        return id == commodity.id && Double.compare(commodity.price, price) == 0 && count == commodity.count && name.equals(commodity.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, count);
    }
}
