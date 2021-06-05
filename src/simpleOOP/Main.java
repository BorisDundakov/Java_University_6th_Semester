package simpleOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of people:");
        int n_people = Integer.parseInt(scanner.nextLine());

        ArrayList<Worker> workers = new ArrayList<>();
        for (int i = 0; i < n_people; i++) {
            System.out.println("Enter sex:");
            String sex = scanner.nextLine();

            System.out.println("Enter country:");
            String country = scanner.nextLine();

            Worker worker = new Worker(sex, country);

            workers.add(worker);
        }

        int f_count = 0;

        for (Worker current : workers) {
            if (current.getSex().equals("female")) {
                f_count++;
            } else if (current.getSex().equals("Female")) {
                f_count++;
            }
        }
        System.out.printf("Count of female workers: %d", f_count);

        int m_count = 0;

        for (Worker current : workers) {
            if (current.getSex().equals("male")) {
                m_count++;
            } else if (current.getSex().equals("Male")) {
                m_count++;
            }
        }
        System.out.println();
        System.out.printf("Count of male workers: %d", m_count);


    }
}
