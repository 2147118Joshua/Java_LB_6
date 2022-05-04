package Java_Lab_6;

import java.util.Scanner;

public class StringClasses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        members M01 = new members("M01", "Joshua", "Stalin", "sj7stalin@gmail.com", "7795233537", "male", 22,
                "Bangalore", "W01");

        M01.fetchMember();

        M01.setDefaultPassword("medium");
        M01.setDefaultPassword("strong");

        System.out.println("\nEnter new password: ");
        String pswd = sc.nextLine();
        System.out.println("Confirm password: ");
        String conPswd = sc.nextLine();
        M01.setPassword(pswd, conPswd);
    }
}
