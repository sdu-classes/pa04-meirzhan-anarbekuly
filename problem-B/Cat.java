public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("Kitty");
    }

    @Override
    public void eat() {
        System.out.println("A cat named " + this.name + " is eating kitekat!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("A cat named " + this.name + " is playing!");
    }
}
