package de.telran.hw_19_02okt_Exception;

public class WrongPasswordException extends Exception{
    // Конструктор по умолчанию
    public WrongPasswordException() {
        super("Ошибка: длина пароля должна быть менее 20 символов");
    }

    // Конструктор с передачей сообщения
    public WrongPasswordException(String message) {
        super(message);
    }
}
