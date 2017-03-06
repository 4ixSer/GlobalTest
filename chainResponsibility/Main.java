package com.chainResponsibility;

import static com.chainResponsibility.ErrorNamber.*;

/**
 * Created by qny4i on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Logger logger1 = new SMSLogger(Error);
        Logger logger2 = new EmailLogger(Deploi);
        Logger logger3 = new ConsolLogger(5);


        logger1.setNext(logger2);
        logger2.setNext(logger3);



        logger1.writeMessage("Все хорошо все работает ",Status_ok);

        logger1.writeMessage("Отладка фич ",Debug);

        logger1.writeMessage("разворачивам сервер ",Deploi);

        logger1.writeMessage("Сервер сгорел ",Error);
    }
}
