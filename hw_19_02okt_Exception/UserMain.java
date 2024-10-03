package de.telran.hw_19_02okt_Exception;

import java.util.Scanner;

public class UserMain {
    // Задание : Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//  Login:
//   1) Длина login должна быть меньше 20 символов и начинаться с латинской буквы.
//   2*) Login должен содержать только латинские буквы, цифры и знак подчеркивания.
// Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//    Password:
//    1) Длина password должна быть меньше 20 символов.
//2*) Должен содержать только латинские буквы, цифры.
//    Также password и confirmPassword должны быть равны.
// Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//
//WrongPasswordException и WrongLoginException - пользовательские классы
// исключения с двумя конструкторами:
//            1) один по умолчанию;
//2*) второй принимает сообщение исключения и передает его в конструктор класса Exception.
//    Метод возвращает true, если значения верны или false в другом случае.
//    Обработка исключений проводится в вызывающем методе.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Boolean result = false;  // флаг для цикла do - while
        do {
            System.out.println("Введите login (меньше 20 символов латинского алфавита может содержать цифры и знак подчеркивания ");
            String login = scanner.nextLine();
            try {
                result = Statistick.validLogin(login);
                System.out.println("Логин валидный");
            } catch (WrongLoginException e) {
                System.out.println("Validation failed: " + e.getMessage());
            }
        } while (result == false);

        result = false; // скинем флаг для переиспользования
        String password = "";  // объявим за циклом для переиспользования
        do {  // блок ввода и обработки пароля
            System.out.println("Введите пароль (меньше 20 символов латинского алфавита и может содержать цифры");
            password = scanner.nextLine();
            try {
                result = Statistick.validPassword(password);
                System.out.println("Пароль валидный");
            } catch (WrongPasswordException e) {
                System.out.println("Validation failed: " + e.getMessage());
                System.out.println("введите паролль ещё раз , только валидный");
            }
        } while (result == false);

        result = false; // скинем флаг для переиспользования
        do {  // блок ввода обработки ПОДТВЕРЖДЕНИЯ пароля
            System.out.println("Подтвердите пароль");
            String confirmPassword = scanner.nextLine();

            try {
                result = Statistick.validconfirmPassword(password, confirmPassword);
                System.out.println("Пароль подтверждён");
            } catch (WrongPasswordException e) {
                System.out.println("Validation failed: " + e.getMessage());
                System.out.println("подтвердите пароль ещё раз , только без ошибки");
            }
        } while (result == false);
    }
}
