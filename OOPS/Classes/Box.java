import java.util.Scanner;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the depth of the box: ");
        double depth = scanner.nextDouble();

        Box box = new Box(width, height, depth);

        System.out.println("Dimensions of the box: width=" + box.width + ", height=" + box.height + ", depth=" + box.depth);
        System.out.println("Volume of the box: " + box.volume());

        scanner.close();
    }
}
