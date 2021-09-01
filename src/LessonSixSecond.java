import com.tms.exception.WrongLoginException;
import com.tms.exception.WrongPasswordException;

import java.util.Scanner;

public class LessonSixSecond {
    static boolean myMethod() {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();

        try {
            if (login.length() > 20)
                throw new WrongLoginException("Длинна логина больше 20");
            if (login.contains(" ")) {
                throw new WrongLoginException("Есть пробелы в логине");
            }
            //--------------------------------------------------------------
            if (password.equals(confirmPassword)) {

            } else {
                throw new WrongPasswordException("Пароли не совпадают");
            }
            if (login.length() > 20)
                throw new WrongPasswordException("Длинна пароля больше 20");
            if (password.contains(" ")) {
                throw new WrongPasswordException("Есть пробелы в пароле");
            }
            if (password.matches(".*[0-9].*")) {
            } else {
                throw new WrongPasswordException("В пароле дожны быть цифры");
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

