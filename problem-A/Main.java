public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        for (int i = 0; i < 10; i++) {
           point.moveRight();
           point.moveDown();
        }
        System.out.println(point);

        MovableCircle circle = new MovableCircle(100, 100, 10, 10, 10);
        System.out.println(circle);
        for (int i = 0; i < 5; i++) {
            circle.moveDown();
            circle.moveRight();
            System.out.println(circle);
        }

        Movable[] movableObjects = new Movable[10];
        for (int i = 0; i < 10; i += 2) {
            movableObjects[i] = new MovablePoint(i, i, 3, 3);
            movableObjects[i + 1] = new MovableCircle(i, i, 3, 3, 10);
        }
        for (Movable movement : movableObjects) {
            System.out.println(movement);
            System.out.println(movement instanceof MovableCircle);
        }
    }
}
