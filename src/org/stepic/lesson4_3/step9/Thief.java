package org.stepic.lesson4_3.step9;

/**
 * 3) Thief – вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе
 * переменную int – минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен
 * присутствовать метод getStolenValue, который возвращает суммарную стоимость всех посылок, которые он своровал.
 * Воровство происходит следующим образом: вместо посылки, которая пришла вору, он отдает новую, такую же,
 * только с нулевой ценностью и содержимым посылки "stones instead of {content}".
 */

public class Thief implements MailService {
    private int minPrice;
    private static int stolenValue = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue(){
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        MailPackage pack;
        if (mail instanceof MailPackage) {
            pack = (MailPackage) mail;
            if (pack.getContent().getPrice() >= minPrice) {
                stolenValue += pack.getContent().getPrice();
                return new MailPackage(pack.getFrom(), pack.getTo(), new Package("stones instead of " + pack.getContent().getContent(), 0));
            }
        }
        return mail;
    }
}
