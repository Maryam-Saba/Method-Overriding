class Animal {

    public void printSound()
 {
        System.out.println("Sound method of parent class");
    }
}

class Dog extends Animal {

    public void printSound() 
{
        System.out.println("Dogs bark");
    }
}

class Cat extends Animal {

    public void printSound()
 {
        System.out.println("Cats meow");
    }
}

class Monkey extends Animal {

    public void printSound()
 {
        System.out.println("Monkey snort");
    }
}

class Overriding {

    public static void main(String[] args)
 {
        Dog d = new Dog();
        Cat c = new Cat();
        Monkey m = new Monkey();

        d.printSound();
        c.printSound();
        m.printSound();
    }
}