package oop.day5.thread;

public class FoodOrder extends Thread {
    String task;
    FoodOrder(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task + "started");
    }

    public static void main(String[] args) {
        FoodOrder cooking = new FoodOrder("Cooking");
        FoodOrder packing = new FoodOrder("Packing");
        FoodOrder delivery = new FoodOrder("Delivery");
        cooking.start();
        packing.start();
        delivery.start();
    }
}