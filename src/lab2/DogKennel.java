package lab2;

import lab2.Dog;

import java.util.ArrayList;

public class DogKennel {
    ArrayList<Dog> dogs = new ArrayList<Dog>();

    public static void main(String[] args) {
        Dog dog1 = new Dog("Vasya", 1);
        Dog dog2 = new Dog("Kolya", 2);
        DogKennel kennel = new DogKennel(dog1, dog2);
        for(int i = 0; i < kennel.dogs.size(); i++){
            System.out.println(kennel.dogs.get(i).toString());
        }
    }

    public DogKennel(Dog... dogs){
        for(int i = 0; i < dogs.length; i++) this.dogs.add(dogs[i]);
    }

}
