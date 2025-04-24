public class Main
{
    public static void main(String[] args)
    {
        Pet pet1 = new Pet();
        System.out.println(pet1 + "\n");

        Pet pet2 = new Pet(10, "Murphy");
        System.out.println(pet2 + "\n");

        Pet pet3 = new Pet();
        System.out.println(pet3 + "\n");

        Dog dog1 = new Dog(5, "Buddy", "Golden Retriever");
        System.out.println(dog1 + "\n");

        Dog dog2 = new Dog(3, "Max", "Bulldog");
        System.out.println(dog2 + "\n");

        Cat cat1 = new Cat(2, "Whiskers", "Black");
        System.out.println(cat1 + "\n");

        Cat cat2 = new Cat(4, "Mittens", "White");
        System.out.println(cat2 + "\n");
    }
}

class Pet
{
    private int age;
    private String name;
    private static int counter = 0;

    public Pet()
    {
        this.age = 0;
        this.name = "Pet " + counter;
        counter++;
    }

    public Pet(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "My age: " + age + "\nMy name: " + name;
    }
}

class Dog extends Pet
{
    private String breed;

    public Dog(int age, String name, String breed)
    {
        super(age, name);
        this.breed = breed;
    }

    public String toString()
    {
        return super.toString() + "\nMy breed: " + breed;
    }
}

class Cat extends Pet
{
    private String color;

    public Cat(int age, String name, String color)
    {
        super(age, name);
        this.color = color;
    }

    public String toString()
    {
        return super.toString() + "\nMy color: " + color;
    }
}

