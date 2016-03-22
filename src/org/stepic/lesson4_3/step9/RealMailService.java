package org.stepic.lesson4_3.step9;
import org.stepic.lesson4_3.step9.Sendable;

/*
Класс, в котором скрыта логика настоящей почты
*/
public class RealMailService implements MailService {

    String name;

    public RealMailService(String name){
        this.name = name;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        System.out.println("");
        return mail;
    }
}
