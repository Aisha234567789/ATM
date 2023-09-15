import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bankaccount bankaccount = new Bankaccount();

        bankaccount.setFirstName("Aisha");
        bankaccount.setLastName("Mahmoud");

        bankaccount.setCredit(364d);
        System.out.println(bankaccount.toString());

        Random random = new Random(485937);
        int tni = random.nextInt(3947640);
        System.out.println(tni);
    }
}