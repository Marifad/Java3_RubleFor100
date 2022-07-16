
public class main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int currentBill = 100;
        int topUp = 1200;
        int bonus = topUp >= 1000 ? topUp / 100 : 0;
        int finalBill = currentBill + bonus;
        System.out.println(bonus);
        System.out.println(finalBill);

    }
}