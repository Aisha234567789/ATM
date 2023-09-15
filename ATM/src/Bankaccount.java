import java.util.Random;
import java.util.Scanner;

public class Bankaccount {


    private String firstName;
    private String lastName;
    private String accountNumber;
    private double credit;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getCredit() {
        return credit;
    }

    public void setFirstName(String firstName) {
        if (firstName.length()<2){
            System.out.println("Default");
        } else {
            this.firstName = firstName;
        }

    }

    public void setLastName(String lastName) {
        if (lastName.length()<2){
            System.out.println("Default");
        } else {
            this.lastName = lastName;
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }



    @Override
    public String toString() {
        return "Bankaccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", credit=" + credit +
                '}';
    }

    Scanner reader1 = new Scanner(System.in);
    Random accontnumber = new Random(35465758);
    int num = accontnumber.nextInt(10000000);

    public void setAccontnumber(Random accontnumber) {
        this.accontnumber = accontnumber;
    }

}
