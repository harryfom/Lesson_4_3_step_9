package org.stepic.lesson4_3.step9;
import org.stepic.lesson4_3.step9.Sendable;

/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
public interface MailService {
    Sendable processMail(Sendable mail);
}

