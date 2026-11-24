class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    String breed;

    void bark() {
        System.out.println(name + " the " + breed + " is barking");
    }
}

class Animals {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.name = "Tommy";
        d.breed = "Labrador";

        d.eat();
        d.bark();
    }
}