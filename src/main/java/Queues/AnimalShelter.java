package Queues;

import java.util.LinkedList;


public class AnimalShelter {
    private LinkedList<Animal> dogs;
    private LinkedList<Animal> cats;
    private int order; // Acts as timestamp

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;
    }

    // Enqueue method to add animal
    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;
        if (animal.getType() == AnimalType.DOG) {
            dogs.add(animal);
        } else if (animal.getType() == AnimalType.CAT) {
            cats.add(animal);
        }
    }

    // Dequeue any animal (the oldest one)
    public Animal dequeueAny() {
        // if one of the queues is empty , dequeue from the other
        if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        }
        // compare orders and return the oldest one
        Animal dog = dogs.peek();
        Animal cat = cats.peek();

        if (dog.getOrder() < cat.getOrder()) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }
    // Dequeue a dog
    public Animal dequeueDog() {
        if (dogs.isEmpty()) {
            return null;
        }
        return dogs.removeFirst();
    }
    // Dequeue a cat
    public Animal dequeueCat() {
        if (cats.isEmpty()) {
            return null;
        }
        return cats.removeFirst();
    }

    // Check if shelter is empty
    public boolean isEmpty() {
        return dogs.isEmpty() && cats.isEmpty();
    }

}
