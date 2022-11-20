public class Hello {
    public static void main(String[] args) {
        int day = 7;
        int hour = 11;
        boolean workDay = day <= 5;
        boolean holiday = day >= 5;

        if (workDay == true && hour <= 8) {
            System.out.println("Доброе утро!");
        } else if (workDay == true && hour <= 11) {
            System.out.println("Все пропало ты проспал!");
        } else if (workDay == true && hour >= 11)
            System.out.println("Включай почту, составляй письмо, что сегодня берешь отгул.");
        else if (holiday == true && hour <= 12) {
            System.out.println("Доброе утро!");
        } else if (holiday == true && hour >= 12 && hour <= 16) {
            System.out.println("Лучше поспать еще.");
        } else if (holiday == true && hour >= 16 && hour <= 18) {
            System.out.println("Вставай, тебя ждет недоигранный Ведьмак");
        } else if (holiday == true && hour >= 18) System.out.println("Дааа, с режимом надо что то делать.");
    }
}

