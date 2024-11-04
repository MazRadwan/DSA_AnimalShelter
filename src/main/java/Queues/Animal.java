package Queues;

public class Animal {
    private AnimalType type;
    private String name;
    private int order; // track arrival time

    public Animal(AnimalType type, String name) {
        this.type = type;
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    public int getOrder() {
        return order;
    }
    public AnimalType getType() {
        return type;
    }
    public String getName() {
        return name;
    }
}
