class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public String eat() {
        return "The " + name + " is " + taste + ".";
    }
}

class Apple extends Fruit {
    public Apple(String size) {
        super("Apple", "sweet and crisp", size);
    }

    @Override
    public String eat() {
        return "The " + name + " is " + taste + ". It's delicious and refreshing.";
    }
}

class Orange extends Fruit {
    public Orange(String size) {
        super("Orange", "citrusy and tangy", size);
    }

    @Override
    public String eat() {
        return "The " + name + " is " + taste + ". It's juicy and invigorating.";
    }
}

public class One {
    public static void main(String[] args) {
        Apple apple = new Apple("medium");
        Orange orange = new Orange("large");

        System.out.println(apple.eat());
        System.out.println(orange.eat());
    }
}
