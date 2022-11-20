public class IdealWeight {
    public static void main(String[] args) {

        idealWeight(67, 180);
    }

    static double idealWeight(double weight, double height) {
        double idealW = (height - 100) - (height * 10 / 100);

        if (weight <= idealW + 5 && weight >= idealW - 5)
            System.out.println("Идеальный вес");
        else
            System.out.println("Не идеальный вес");

        return idealW;
    }
}

