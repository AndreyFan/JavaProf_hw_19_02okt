package de.telran.hw_19_02okt_Exception;

public class WrongLoginException extends Exception{
    public WrongLoginException() {     // Конструктор по умолчанию
        super("Ошибка : Длина логина должна быть менее 20 символов");
    }

    public WrongLoginException(String message) { // Конструктор с передачей сообщения
        super(message);
    }
}
