public class TimesOfDay {
    public static void main(String[] args) {
        timesOfDay(5);

    }

    static int timesOfDay(int time) {
        if (time > 4 && time <= 11) {
            System.out.println("Утро");
        } else if (time > 11 && time <= 16) {
            System.out.println("День");
        } else if (time > 17 && time <= 23) {
            System.out.println("Вечер");
        } else if (time <= 5) {
            System.out.println("Ночь");
        }
        return time;
    }
}

