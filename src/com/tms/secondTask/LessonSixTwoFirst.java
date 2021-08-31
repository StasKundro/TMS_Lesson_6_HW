package com.tms.secondTask;

import java.util.Scanner;

public class LessonSixTwoFirst {
    static boolean myMethod() {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();

        try {
            if (login.length() > 20)
                throw new WrongLoginException("Длинна логина больше 20");
            int space1 = login.indexOf(" ");
            if (space1 == -1) {
            } else {
                throw new WrongLoginException("Есть пробелы в логине");
            }
            //--------------------------------------------------------------
            if (password.equals(confirmPassword)) {

            } else {
                throw new WrongPasswordException("Пароли не совпадают");
            }
            if (login.length() > 20)
                throw new WrongPasswordException("Длинна пароля больше 20");
            int space2 = password.indexOf(" ");
            if (space2 == -1) {
            } else {
                throw new WrongPasswordException("Есть пробелы в пароле");
            }
            System.out.println("Клиент " + login + " зарегистрирован");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void main(String[] args) {
        myMethod();

    }
}

