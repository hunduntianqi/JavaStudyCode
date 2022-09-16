package com.$11_Gather.GatherDemo.$1_CollectionGather;

public class $2_Card {
    private String size;
    private String color;
    private int index; //牌的真正大小

    public $2_Card() {
    }

    public $2_Card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return size + color;
    }
}
