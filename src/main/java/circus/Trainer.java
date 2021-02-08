package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);
// these upcasting are redundant
        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        // train(new Parrot());
        //Animal a2 = new Animal();
        //Bird b2 = new Bird();
    }
    //substitutability
    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }// at runtime, look at the object not ref

    private static void train(Bird bird) {
        if (bird instanceof Duck) {//search Action: surrandwith
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
