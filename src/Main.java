import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1.1f, 2.2f,10.0f, 20.0f);
        System.out.println(Arrays.toString(movablePoint.getXY()));
        System.out.println(Arrays.toString(movablePoint.move().getXY()));

    }
}
