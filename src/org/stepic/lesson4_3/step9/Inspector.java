package org.stepic.lesson4_3.step9;

/**
 * 4) Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде
 * исключения, если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из
 * запрещенных содержимым ("weapons" и "banned substance"), то он бросает IllegalPackageException.
 * Если он находит посылку, состаящую из камней (содержит слово "stones"), то тревога прозвучит в виде
 * StolenPackageException. Оба исключения вы должны объявить самостоятельно в виде непроверяемых исключений.
 */
public class Inspector implements MailService {
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    @Override
    public Sendable processMail(Sendable mail) {
        MailPackage mailPackage;
        if (mail instanceof MailPackage) {
            mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getContent().equals(WEAPONS)
                    || mailPackage.getContent().getContent().equals(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
            if (mailPackage.getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
