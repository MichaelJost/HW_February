public class Main<i> {

    public static void main(String[] args) {


        int sum = 0;
        int Vitamins[] = {3, 2, 4, 5, 8, 6, 9};

        for (int i = 0; i < Vitamins.length; i++) {

        sum += Vitamins[i];

        }
        System.out.println("You have to take " + sum + " vitamins this week");

    }
}