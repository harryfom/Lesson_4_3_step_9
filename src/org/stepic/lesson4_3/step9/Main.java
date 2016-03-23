package org.stepic.lesson4_3.step9;

/**
 * Created by FomeIV on 22.03.2016.
 * Для тестирования решения
 */
public class Main {
    public static void main(String[] args) {
        UntrustworthyMailWorker uw = new UntrustworthyMailWorker(new MailService[]{new RealMailService(),new RealMailService()});
        uw.processMail(new MailMessage("From Addr","To Addr", "Message Message Message"));

        Spy spy = new Spy();
        spy.processMail(new MailMessage("Austin Powers", "007", "secret message"));
        spy.processMail(new MailMessage("Штирлиц", "Борман", "secret message"));


    }

}
