package org.stepic.lesson4_3.step9;

/**
 * Интерфейс: сущность, которую можно отправить по почте.
 * У такой сущности можно получить от кого и кому направляется письмо.
 */
public interface Sendable {
    String getFrom();

    String getTo();
}