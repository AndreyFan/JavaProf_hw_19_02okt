package de.telran.hw_19_02okt_Exception;

public class Statistick {  // В этом классе напишем только методы проверки
    public static boolean validLogin(String login)
            throws WrongLoginException {      // Проверка логина

        if (login.length() >= 20 || !Character.isLetter(login.charAt(0))) {
            throw new WrongLoginException();
        }
        if (!login.matches("[A-Za-z0-9_]+")) {
            throw new WrongLoginException("Login должен содержать только латинские буквы, цифры и знак подчеркивания");
        }

        return true; // Если все проверки пройдены
    }

    public static boolean validPassword(String password)
            throws WrongPasswordException {         // Проверка пароля

        if (password.length() >= 20) {
            throw new WrongPasswordException();
        }
        if (!password.matches("[A-Za-z0-9]+")) {
            throw new WrongPasswordException("Password должен содержать только латинские буквы и цифры");
        }

        return true; // Если все проверки пройдены
    }

    public static boolean validconfirmPassword(String password, String confirmPassword)
            throws WrongPasswordException { // проверка подтверждения пароля

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Ошибка: password и confirmPassword должны быть равны");
        }

        return true; // Если все проверки пройдены
    }


}
