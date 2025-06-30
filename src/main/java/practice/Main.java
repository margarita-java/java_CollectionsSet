import practice.EmailList;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();

        while (true) {
            System.out.println("Введите команду: ");
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String[] parts = input.split(" ", 2);
            String command = parts[0].toUpperCase();
            switch (command) {
                case "ADD":
                    if (parts.length > 1) {
                        emailList.add(parts[1]);
                    } else {
                        System.out.println("Ошибка: email не введён");
                    }
                    break;
                case "LIST":
                    emailList.getSortedEmails();
                    break;
            }

        }
    }
}

