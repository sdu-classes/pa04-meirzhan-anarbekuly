public class Main {
    public static void main(String[] args) {
         Fish d = new Fish();
         d.eat();

         try {
             d.walk();
         } catch (UnsupportedOperationException exc) {
             System.out.println(exc.getMessage());
         }


        Cat c = new Cat("Fluffy");
        c.play();
        c.eat();
        c.walk();

        Animal e = new Spider();
        e.walk();
        Pet p = new Cat();
        //p.getName();
    }
}
