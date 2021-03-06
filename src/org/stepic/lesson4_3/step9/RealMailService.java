package org.stepic.lesson4_3.step9;
import org.stepic.lesson4_3.step9.Sendable;

/*
Класс, в котором скрыта логика настоящей почты
*/
public class RealMailService implements MailService {
    static int counter = 0;

    String name;

    public RealMailService() {
        counter++;
        name = "RealMailService"+counter;
    }

    public RealMailService(String name){
        counter++;
        this.name = name;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        System.out.println("RealMailService: "+name+"");
        return mail;
    }
}
