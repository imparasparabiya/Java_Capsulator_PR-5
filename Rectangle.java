public class Rectangle {
    public static void main(String[] args) {
        Ans.getData();
    }
}

class Ans {
    public static int lenght = 15;
    public static int width = 21;

    public static void getData() {
        System.out.println("Rectangle = " + (lenght * width));
    }
}