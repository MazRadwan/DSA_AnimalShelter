package Queues;

public class Main {
    public static void main(String[] args) {
        // create an animal shelter
        AnimalShelter shelter = new AnimalShelter();

        // add animals to the shelter
       shelter.enqueue(new Animal(AnimalType.DOG, "Rex"));
       shelter.enqueue(new Animal(AnimalType.CAT, "Whiskers"));
       shelter.enqueue(new Animal(AnimalType.DOG, "Buddy"));
       shelter.enqueue(new Animal(AnimalType.CAT, "Fluffy"));

       // test dequeing
         System.out.println(shelter.dequeueAny().getName());
            System.out.println(shelter.dequeueDog().getName());
            System.out.println(shelter.dequeueCat().getName());
            System.out.println(shelter.dequeueAny().getName());

        }
    }

