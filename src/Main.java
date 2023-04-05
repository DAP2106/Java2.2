public class Main {
    public static void main(String[] args) {

        int check = 100;
        int deposit = 1100;
        int bonus ;

        if ( deposit  > 1000) {bonus = deposit / 100 ; } else {bonus = 0;}

        int balance = (check + deposit + bonus);

        System.out.println("Ваш бонус " + bonus + " рублей   ");
        System.out.println("Ваш баланс "   + balance + "  Рублей  ");
    }
}
