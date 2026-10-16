package org.example;

public class Aircraft {
    private String model;
    private int capacity;
    public Aircraft(String model, int capacity){
        this.model=model;
        this.capacity=capacity;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
    public String  getLayout(){
        return "3-3 Seating";
    }
}
